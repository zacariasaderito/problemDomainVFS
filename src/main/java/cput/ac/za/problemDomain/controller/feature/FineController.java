package cput.ac.za.problemDomain.controller.feature;

import cput.ac.za.problemDomain.domain.feature.Fine;
import cput.ac.za.problemDomain.factory.feature.FineFactory;
import cput.ac.za.problemDomain.services.implementation.feature.FineServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/problemDomain/fine")
public class FineController {

    @Autowired
    private FineServiceImplementation service;

    @GetMapping("/create/{name}")
    public @ResponseBody
    Fine create(@PathVariable String name) {
//        Fine fine = FineFactory.getFine();
        return null;
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Fine> getAll(){
        return service.getAll();
    }
}
