package cput.ac.za.problemDomain.services.implementation.feature;

import cput.ac.za.problemDomain.Repository.Interfaces.feature.FineRepository;
import cput.ac.za.problemDomain.domain.feature.Fine;
import cput.ac.za.problemDomain.services.interfaces.feature.FineService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class FineServiceImplementation implements FineService {

    //    @Autowired
//    @Qualifier("InMemory")
    private FineRepository repository;
    private static FineServiceImplementation service = null;

    private FineServiceImplementation() {
    }

    public static FineServiceImplementation getService() {
        if (service == null)
            service = new FineServiceImplementation();

        return service;
    }

    @Override
    public Fine create(Fine fine) {
        return repository.create(fine);
    }

    @Override
    public Fine update(Fine fine) {
        return repository.update(fine);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Fine read(String s) {
        return repository.read(s);
    }

    @Override
    public List<Fine> getAll() {
        return this.repository.getAll();
    }

}
