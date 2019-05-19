package cput.ac.za.problemDomain.controller.feature;

import cput.ac.za.problemDomain.domain.feature.Warrant;
import cput.ac.za.problemDomain.factory.feature.WarrantFactory;
import cput.ac.za.problemDomain.services.implementation.feature.WarrantServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/problemDomain/warrant")
public class WarrantController {


    @Autowired
    private WarrantServiceImplementation service;

    @GetMapping("/create/{name}")
    public @ResponseBody
    Warrant create(@PathVariable String name) {
//        Warrant warrant = WarrantFactory.getWarrant();
        return null;
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Warrant> getAll(){
        return service.getAll();
    }

}
