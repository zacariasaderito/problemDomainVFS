package cput.ac.za.problemDomain.Repository.implementation.person;

import cput.ac.za.problemDomain.Repository.Interfaces.person.DriverRepository;
import cput.ac.za.problemDomain.domain.person.Driver;

import java.util.*;

public class DriverRepositoryImplementation implements DriverRepository {

    private static DriverRepositoryImplementation repository =  null;
    private Map<String, Driver> drivers;


    public static DriverRepositoryImplementation getRepository() {
        if (repository == null)
            repository = new DriverRepositoryImplementation();
        return repository;
    }

    private DriverRepositoryImplementation() {
        this.drivers = new HashMap<>();
    }

    @Override
    public Driver create(Driver driver) {
        this.drivers.put(driver.getId(), driver);
        return driver;
    }

    @Override
    public Driver update(Driver driver) {
        this.drivers.replace(driver.getId(), driver);
        return this.drivers.get(driver.getId());
    }

    @Override
    public void delete(String id) {
        this.drivers.remove(id);
    }

    @Override
    public Driver read(String id) {
        return this.drivers.get(id);
    }

    @Override
    public Set<Driver> getAll() {
        Collection<Driver> drivers = this.drivers.values();
        Set<Driver> set = new HashSet<>();
        set.addAll(drivers);
        return set;
    }
}
