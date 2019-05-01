package cput.ac.za.problemDomain.Repository.implementation;

import cput.ac.za.problemDomain.Repository.OfficerRepository;
import cput.ac.za.problemDomain.domain.feature.Offence;
import cput.ac.za.problemDomain.domain.person.Officer;

import java.util.HashSet;
import java.util.Set;

public class OffenceRepositoryImplementation implements OfficerRepository {


    private static OffenceRepositoryImplementation repository = null;
    private Set<Offence> offences;

    public static OffenceRepositoryImplementation getRepository() {
        if (repository == null)
            repository = new OffenceRepositoryImplementation();
        return repository;
    }

    private OffenceRepositoryImplementation() {
        this.offences = new HashSet<>();
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
