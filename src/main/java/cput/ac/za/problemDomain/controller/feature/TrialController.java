package cput.ac.za.problemDomain.controller.feature;

import cput.ac.za.problemDomain.domain.feature.Trial;
import cput.ac.za.problemDomain.factory.feature.TrialFactory;
import cput.ac.za.problemDomain.services.implementation.feature.TrialServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/problemDomain/trial")
public class TrialController {

    @Autowired
    private TrialServiceImplementation service;

    @GetMapping("/create/{name}")
    public @ResponseBody
    Trial create(@PathVariable String name) {
        Trial trial = TrialFactory.getTrial("You will see the Judge soon");
        return trial;
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Trial> getAll(){
        return service.getAll();
    }

}
