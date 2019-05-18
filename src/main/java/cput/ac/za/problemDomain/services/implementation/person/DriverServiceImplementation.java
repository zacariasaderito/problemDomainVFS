package cput.ac.za.problemDomain.services.implementation.person;

import cput.ac.za.problemDomain.Repository.Interfaces.person.DriverRepository;
import cput.ac.za.problemDomain.domain.person.Driver;
import cput.ac.za.problemDomain.services.interfaces.person.DriverService;

//@Service
public class DriverServiceImplementation implements DriverService {

//  @Autowired
    private DriverRepository repository;


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

//    public void getAll() {
//    }

}
