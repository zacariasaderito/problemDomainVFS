package cput.ac.za.problemDomain.services.implementation.feature;

import cput.ac.za.problemDomain.Repository.Interfaces.feature.OffenceRepository;
import cput.ac.za.problemDomain.domain.feature.Offence;
import cput.ac.za.problemDomain.services.interfaces.feature.OffenceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class OffenceServiceImplementation implements OffenceService {

    //    @Autowired
//    @Qualifier("InMemory")
    private OffenceRepository repository;
    private static OffenceServiceImplementation service = null;

    private OffenceServiceImplementation() {
    }

    public static OffenceServiceImplementation getService() {
        if (service == null)
            service = new OffenceServiceImplementation();

        return service;
    }

    @Override
    public Offence create(Offence offence) {
        return repository.create(offence);
    }

    @Override
    public Offence update(Offence offence) {
        return repository.update(offence);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Offence read(String s) {
        return repository.read(s);
    }

    @Override
    public List<Offence> getAll() {
        return this.repository.getAll();
    }

}
