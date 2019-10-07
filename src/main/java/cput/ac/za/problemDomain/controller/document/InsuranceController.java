package cput.ac.za.problemDomain.controller.document;

import cput.ac.za.problemDomain.Repository.Interfaces.document.InsuranceRepository;
import cput.ac.za.problemDomain.ResponseObject;
import cput.ac.za.problemDomain.domain.document.Insurance;
import cput.ac.za.problemDomain.factory.ResponseObjectFactory;
import cput.ac.za.problemDomain.factory.document.InsuranceFactory;
import cput.ac.za.problemDomain.services.implementation.document.InsuranceServiceImplementation;
import cput.ac.za.problemDomain.services.interfaces.document.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/problemDomain/insurance")
public class InsuranceController {

    @Autowired
    private InsuranceServiceImplementation service;


    @GetMapping("/create/{description}")
    public ResponseEntity create(@PathVariable String description) {
        ResponseObject responseObject = ResponseObjectFactory.buildGenericResponseObject(HttpStatus.OK.toString(), "Insurance created!");
        Insurance savedInsurance = null;
        if (description == null || description.trim().isEmpty() || description.trim().equalsIgnoreCase("null")) {
            responseObject.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObject.setResponseDescription("Provide an Insurance");
        }
        else
        {
            savedInsurance = service.retrieveByDescription(description);
        }
        if (savedInsurance != null)
        {
            responseObject.setResponseDescription("Insurance already exists!");
        }
        else
        {
            savedInsurance = InsuranceFactory.getInsurance(100, description, true,202020);
            savedInsurance = service.create(savedInsurance);
        }

        responseObject.setResponse(savedInsurance);

        //Insurance insurance = InsuranceFactory.getInsurance(100, description, true,202020);
        return ResponseEntity.ok(savedInsurance);
    }

    @GetMapping("/getall")
    public ResponseEntity getAll() {
        ResponseObject responseObject = ResponseObjectFactory.buildGenericResponseObject(HttpStatus.OK.toString(), "Insurance created!");
        List<Insurance> insurances = service.getAll();

        responseObject.setResponse(insurances);
        return ResponseEntity.ok(responseObject);

    }

    @GetMapping("/get")
    @ResponseBody
    public String test() {
        return "Test";
    }





}
