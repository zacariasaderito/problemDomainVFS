package cput.ac.za.problemDomain.services.implementation.feature;

import cput.ac.za.problemDomain.Repository.Interfaces.feature.WarrantRepository;
import cput.ac.za.problemDomain.Repository.implementation.feature.WarrantRepositoryImplementation;
import cput.ac.za.problemDomain.domain.feature.Warrant;
import cput.ac.za.problemDomain.services.interfaces.feature.WarrantService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class WarrantServiceImplementation implements WarrantService {

    //    @Autowired
//    @Qualifier("InMemory")
    private WarrantRepository repository;
    private static WarrantServiceImplementation service = null;

    private WarrantServiceImplementation() {
        this.repository = WarrantRepositoryImplementation.getRepository();
    }

    public static WarrantServiceImplementation getService() {
        if (service == null)
            service = new WarrantServiceImplementation();

        return service;
    }

    @Override
    public Warrant create(Warrant warrant) {
        return repository.create(warrant);
    }

    @Override
    public Warrant update(Warrant warrant) {
        return repository.update(warrant);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Warrant read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Warrant> getAll() {
        return this.repository.getAll();
    }

}
