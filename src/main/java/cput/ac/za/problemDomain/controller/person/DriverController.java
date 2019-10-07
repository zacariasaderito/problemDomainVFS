package cput.ac.za.problemDomain.controller.person;

import cput.ac.za.problemDomain.domain.person.Driver;
import cput.ac.za.problemDomain.factory.person.DriverFactory;
import cput.ac.za.problemDomain.services.implementation.person.DriverServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/problemDomain/driver")
public class DriverController {


    @Autowired
    private DriverServiceImplementation service;

    @GetMapping("/create/{name}")
    public @ResponseBody
    Driver create(@PathVariable String name) {
//        Driver driver = DriverFactory.getDriver("Ade", 22, "Lubango", 0616,);
//        return driver;
        return null;
    }

    @GetMapping("/getall")
    @ResponseBody
    public List<Driver> getAll(){
        return service.getAll();
    }
}
