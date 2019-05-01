package cput.ac.za.problemDomain.Repository.implementation;

import cput.ac.za.problemDomain.Repository.OfficerRepository;
import cput.ac.za.problemDomain.domain.person.Officer;

import java.util.HashSet;
import java.util.Set;

public class OfficerRepositoryImplementation implements OfficerRepository {

    private static OfficerRepositoryImplementation repository = null;
    private Set<Officer> officers;

    public static OfficerRepositoryImplementation getRepository() {
        if (repository == null)
            repository = new OfficerRepositoryImplementation();
        return repository;
    }

    private OfficerRepositoryImplementation() {
        this.officers = new HashSet<>();
    }


    @Override
    public Officer create(Officer officer) {
        return null;
    }

    @Override
    public Officer update(Officer officer) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Officer read(String s) {
        return null;
    }
}
