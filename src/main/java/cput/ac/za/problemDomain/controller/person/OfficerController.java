package cput.ac.za.problemDomain.controller.person;

import cput.ac.za.problemDomain.domain.person.Officer;
import cput.ac.za.problemDomain.factory.person.OfficerFactory;
import cput.ac.za.problemDomain.services.implementation.person.OfficerServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/problemDomain/officer")
public class OfficerController {

    @Autowired
    private OfficerServiceImplementation service;

    @GetMapping("/create/{name}")
    public @ResponseBody
    Officer create(@PathVariable String name) {
        Officer officer = OfficerFactory.getOfficer("Leonadas","Traffic Regulator");
        return officer;
    }

    @GetMapping("/getall")
    @ResponseBody
    public List<Officer> getAll(){
        return service.getAll();
    }

}
