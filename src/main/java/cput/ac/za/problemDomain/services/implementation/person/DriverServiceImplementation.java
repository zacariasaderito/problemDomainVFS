package cput.ac.za.problemDomain.services.implementation.person;

import cput.ac.za.problemDomain.Repository.Interfaces.person.DriverRepository;
import cput.ac.za.problemDomain.Repository.implementation.person.DriverRepositoryImplementation;
import cput.ac.za.problemDomain.domain.person.Driver;
import cput.ac.za.problemDomain.services.interfaces.person.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DriverServiceImplementation implements DriverService {

//    @Autowired
//    @Qualifier("InMemory")
    private DriverRepository repository;
    private static DriverServiceImplementation service = null;

    private DriverServiceImplementation() {
        this.repository = DriverRepositoryImplementation.getRepository();
    }

    public static DriverServiceImplementation getService() {
        if (service == null)
            service = new DriverServiceImplementation();

        return service;
    }

    @Override
    public Driver create(Driver driver) {
        return repository.create(driver);
    }

    @Override
    public Driver update(Driver driver) {
        return repository.update(driver);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Driver read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Driver> getAll() {
        return this.repository.getAll();
    }

}
