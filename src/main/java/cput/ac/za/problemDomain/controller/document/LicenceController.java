package cput.ac.za.problemDomain.controller.document;

import cput.ac.za.problemDomain.domain.document.Licence;
import cput.ac.za.problemDomain.factory.document.LicenceFactory;
import cput.ac.za.problemDomain.services.implementation.document.LicenceServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/problemDomain/licence")
public class LicenceController {

    @Autowired
    private LicenceServiceImplementation service;

    @GetMapping("/create/{name}")
    public @ResponseBody
    Licence create(@PathVariable String name) {
        Licence licence = LicenceFactory.createLicense("car");
        return licence;
    }

    @GetMapping("/getall")
    @ResponseBody
    public List<Licence> getAll(){
        return service.getAll();
    }

}
