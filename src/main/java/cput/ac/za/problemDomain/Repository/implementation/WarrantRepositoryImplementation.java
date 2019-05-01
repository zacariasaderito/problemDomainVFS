package cput.ac.za.problemDomain.Repository.implementation;

import cput.ac.za.problemDomain.Repository.WarrantRepository;
import cput.ac.za.problemDomain.domain.feature.Warrant;

import java.util.HashSet;
import java.util.Set;

public class WarrantRepositoryImplementation implements WarrantRepository {


    private static WarrantRepositoryImplementation repository = null;
    private Set<Warrant> warrants;

    public static WarrantRepositoryImplementation getRepository() {
        if (repository == null)
            repository = new WarrantRepositoryImplementation();
        return repository;
    }

    private WarrantRepositoryImplementation() {
        this.warrants = new HashSet<>();
    }


    @Override
    public Warrant create(Warrant warrant) {
        return null;
    }

    @Override
    public Warrant update(Warrant warrant) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Warrant read(String s) {
        return null;
    }
}
