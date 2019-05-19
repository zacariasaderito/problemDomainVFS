package cput.ac.za.problemDomain.controller.document;

import cput.ac.za.problemDomain.Repository.Interfaces.document.RegistrationCertificateRepository;
import cput.ac.za.problemDomain.domain.document.RegistrationCertificate;
import cput.ac.za.problemDomain.services.implementation.document.RegistrationCertificateServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/problemDomain/registrationcertificate")
public class RegistrationCertificateController {


        @Autowired
        private RegistrationCertificateServiceImplementation service;

        @GetMapping("/create/{name}")
        public @ResponseBody
    RegistrationCertificate create(@PathVariable String name) {
//        RegistrationCertificate registrationCertificate = RegistrationCertificate
        return null;
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<RegistrationCertificate> getAll(){
        return service.getAll();
    }
}
