package cput.ac.za.problemDomain.controller.document;

import cput.ac.za.problemDomain.domain.document.RoadTax;
import cput.ac.za.problemDomain.services.implementation.document.RoadTaxServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/problemDomain/roadtax")
public class RoadTaxController {


    @Autowired
    private RoadTaxServiceImplementation service;

    @GetMapping("/create/{name}")
    public @ResponseBody
    RoadTax create(@PathVariable String name) {
//        RoadTax roadTax = RoadTaxFactory

        return null;
    }

    @GetMapping("/getall")
    @ResponseBody
    public List<RoadTax> getAll(){
        return service.getAll();
    }

}
