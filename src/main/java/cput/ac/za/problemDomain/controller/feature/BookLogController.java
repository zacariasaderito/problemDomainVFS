package cput.ac.za.problemDomain.controller.feature;

import cput.ac.za.problemDomain.domain.feature.BookLog;
import cput.ac.za.problemDomain.factory.feature.BookLogFactory;
import cput.ac.za.problemDomain.services.implementation.feature.BookLogServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/problemDomain/booklog")
public class BookLogController {


    @Autowired
    private BookLogServiceImplementation service;

    @GetMapping("/create/{name}")
    public @ResponseBody
    BookLog create(@PathVariable String name) {
        BookLog bookLog = BookLogFactory.getBookLog(1234);
        return bookLog;
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<BookLog> getAll(){
        return service.getAll();
    }

}
