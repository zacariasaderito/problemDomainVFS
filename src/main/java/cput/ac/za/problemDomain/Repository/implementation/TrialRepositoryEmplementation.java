package cput.ac.za.problemDomain.Repository.implementation;

import cput.ac.za.problemDomain.Repository.TrialRepository;
import cput.ac.za.problemDomain.domain.feature.Trial;

import java.util.HashSet;
import java.util.Set;

public class TrialRepositoryEmplementation implements TrialRepository {


    private static TrialRepositoryEmplementation repository = null;
    private Set<Trial> trials;

    public static TrialRepositoryEmplementation getRepository() {
        if (repository == null)
            repository = new TrialRepositoryEmplementation();
        return repository;
    }

    private TrialRepositoryEmplementation() {
        this.trials = new HashSet<>();
    }


    @Override
    public Trial create(Trial trial) {
        return null;
    }

    @Override
    public Trial update(Trial trial) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Trial read(String s) {
        return null;
    }
}
