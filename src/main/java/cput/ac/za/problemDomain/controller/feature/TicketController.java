package cput.ac.za.problemDomain.controller.feature;

import cput.ac.za.problemDomain.domain.feature.Ticket;
import cput.ac.za.problemDomain.factory.feature.TicketFactory;
import cput.ac.za.problemDomain.services.implementation.feature.TicketServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/problemDomain/ticket")
public class TicketController {


    @Autowired
    private TicketServiceImplementation service;

    @GetMapping("/create/{name}")
    public @ResponseBody
    Ticket create(@PathVariable String name) {
//        Ticket ticket = TicketFactory.getTicket();
        return null;
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Ticket> getAll(){
        return service.getAll();
    }
}
