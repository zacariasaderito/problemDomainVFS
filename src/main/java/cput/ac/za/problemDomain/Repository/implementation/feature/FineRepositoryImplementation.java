package cput.ac.za.problemDomain.Repository.implementation.feature;

import cput.ac.za.problemDomain.Repository.Interfaces.feature.FineRepository;
import cput.ac.za.problemDomain.domain.feature.Fine;

import java.util.HashSet;
import java.util.Set;

public class FineRepositoryImplementation implements FineRepository {

    private static FineRepositoryImplementation repository = null;
    private Set<Fine> fines;

    public static FineRepositoryImplementation getRepository() {
        if (repository == null)
            repository = new FineRepositoryImplementation();
        return repository;
    }

    private FineRepositoryImplementation() {
        this.fines = new HashSet<>();
    }


    @Override
    public Fine create(Fine fine) {
        return null;
    }

    @Override
    public Fine update(Fine fine) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Fine read(String s) {
        return null;
    }
}
