package cput.ac.za.problemDomain.controller.transport;

import cput.ac.za.problemDomain.domain.transport.Vehicle;
import cput.ac.za.problemDomain.factory.transport.VehicleFactory;
import cput.ac.za.problemDomain.services.implementation.transport.VehicleServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/problemDomain/vehicle")
public class VehicleController {


    @Autowired
    private VehicleServiceImplementation service;

    @GetMapping("/create/{name}")
    public @ResponseBody
    Vehicle create(@PathVariable String name) {
        Vehicle vehicle = VehicleFactory.createVehicle("moto");
        return vehicle;
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Vehicle> getAll(){
        return service.getAll();
    }

}
