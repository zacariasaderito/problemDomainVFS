package cput.ac.za.problemDomain.services.implementation.feature;

import cput.ac.za.problemDomain.Repository.Interfaces.feature.TrialRepository;
import cput.ac.za.problemDomain.domain.feature.Trial;
import cput.ac.za.problemDomain.services.interfaces.feature.TrialService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class TrialServiceImplementation implements TrialService {

    //    @Autowired
//    @Qualifier("InMemory")
    private TrialRepository repository;
    private static TrialServiceImplementation service = null;

    private TrialServiceImplementation() {
    }

    public static TrialServiceImplementation getService() {
        if (service == null)
            service = new TrialServiceImplementation();

        return service;
    }

    @Override
    public Trial create(Trial trial) {
        return repository.create(trial);
    }

    @Override
    public Trial update(Trial trial) {
        return repository.update(trial);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Trial read(String s) {
        return repository.read(s);
    }

    @Override
    public List<Trial> getAll() {
        return this.repository.getAll();
    }

}
