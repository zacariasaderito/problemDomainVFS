package cput.ac.za.problemDomain.services.implementation.person;

import cput.ac.za.problemDomain.Repository.Interfaces.person.OfficerRepository;
import cput.ac.za.problemDomain.Repository.implementation.person.OfficerRepositoryImplementation;
import cput.ac.za.problemDomain.domain.person.Officer;
import cput.ac.za.problemDomain.services.interfaces.person.OfficerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OfficerServiceImplementation implements OfficerService {
//        @Autowired
//    @Qualifier("InMemory")
    private OfficerRepository repository;
    private static OfficerServiceImplementation service = null;

    private OfficerServiceImplementation() {
        this.repository = OfficerRepositoryImplementation.getRepository();
    }

    public static OfficerServiceImplementation getService() {
        if (service == null)
            service = new OfficerServiceImplementation();

        return service;
    }


    @Override
    public Officer create(Officer officer) {
        return repository.create(officer);
    }

    @Override
    public Officer update(Officer officer) {
        return repository.update(officer);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Officer read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Officer> getAll() {
        return this.repository.getAll();
    }

}
