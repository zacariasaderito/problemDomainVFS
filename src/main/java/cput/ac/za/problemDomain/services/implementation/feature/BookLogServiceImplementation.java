package cput.ac.za.problemDomain.services.implementation.feature;

import cput.ac.za.problemDomain.Repository.Interfaces.feature.BookLogRepository;
import cput.ac.za.problemDomain.Repository.implementation.feature.BookLogRepositoryImplementation;
import cput.ac.za.problemDomain.domain.feature.BookLog;
import cput.ac.za.problemDomain.services.interfaces.feature.BookLogService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BookLogServiceImplementation implements BookLogService {

    //    @Autowired
//    @Qualifier("InMemory")
    private BookLogRepository repository;
    private static BookLogServiceImplementation service = null;

    private BookLogServiceImplementation() {
        this.repository = BookLogRepositoryImplementation.getRepository();
    }

    public static BookLogServiceImplementation getService() {
        if (service == null)
            service = new BookLogServiceImplementation();

        return service;
    }

    @Override
    public BookLog create(BookLog bookLog) {
        return repository.create(bookLog);
    }

    @Override
    public BookLog update(BookLog bookLog) {
        return repository.update(bookLog);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public BookLog read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<BookLog> getAll() {
        return this.repository.getAll();
    }

}
