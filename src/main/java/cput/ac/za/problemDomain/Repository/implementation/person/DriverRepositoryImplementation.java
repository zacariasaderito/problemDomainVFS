package cput.ac.za.problemDomain.Repository.implementation.person;

import cput.ac.za.problemDomain.Repository.Interfaces.person.DriverRepository;
import cput.ac.za.problemDomain.domain.person.Driver;

import java.util.HashSet;
import java.util.Set;

public class DriverRepositoryImplementation implements DriverRepository {

    private static DriverRepositoryImplementation repository =  null;
    private Set<Driver> drivers;

    public static DriverRepositoryImplementation getRepository() {
        if (repository == null)
            repository = new DriverRepositoryImplementation();
        return repository;
    }

    private DriverRepositoryImplementation() {
        this.drivers = new HashSet<>();
    }

    @Override
    public Driver create(Driver driver) {
        return null;
    }

    @Override
    public Driver update(Driver driver) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Driver read(String s) {
        return null;
    }
}
