package cput.ac.za.problemDomain.controller.feature;

import cput.ac.za.problemDomain.Repository.Interfaces.feature.OffenceRepository;
import cput.ac.za.problemDomain.domain.feature.Offence;
import cput.ac.za.problemDomain.services.implementation.feature.OffenceServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/problemDomain/offence")
public class OffenceController {


    @Autowired
    private OffenceServiceImplementation service;

    @GetMapping("/create/{name}")
    public @ResponseBody
    Offence create(@PathVariable String name) {
//        Offence offence= OffenceFactory.getFactory();
          return null;
    }

    @GetMapping("/getall")
    @ResponseBody
    public List<Offence> getAll(){
        return service.getAll();
    }
}
