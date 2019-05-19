package cput.ac.za.problemDomain.controller.document;

import cput.ac.za.problemDomain.domain.document.Insurance;
import cput.ac.za.problemDomain.factory.document.InsuranceFactory;
import cput.ac.za.problemDomain.services.implementation.document.InsuranceServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/problemDomain/insurance")
public class InsuranceController {

    @Autowired
    private InsuranceServiceImplementation service;

    @GetMapping("/create/{name}")
    public @ResponseBody
    Insurance create(@PathVariable String name) {
        Insurance insurance = null;
//        Insurance insurance = InsuranceFactory.getInsurance(100, "Insurance level 1", true,("2018-09-09"));
        return service.create(insurance);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Insurance> getAll(){
        return service.getAll();
    }


}
