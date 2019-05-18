package cput.ac.za.problemDomain.Repository.implementation.feature;

import cput.ac.za.problemDomain.Repository.Interfaces.feature.FineRepository;
import cput.ac.za.problemDomain.domain.feature.Fine;

import java.util.*;

public class FineRepositoryImplementation implements FineRepository {

    private static FineRepositoryImplementation repository = null;
    private Map<String, Fine> fines;

    public static FineRepositoryImplementation getRepository() {
        if (repository == null)
            repository = new FineRepositoryImplementation();
        return repository;
    }

    private FineRepositoryImplementation() {
        this.fines = new HashMap<>();
    }


    @Override
    public Fine create(Fine fine) {
        this.fines.put(fine.getFineNumber(), fine);
        return fine;
    }

    @Override
    public Fine update(Fine fine) {
        this.fines.replace(fine.getFineNumber(), fine);
        return this.fines.get(fine.getFineNumber());
    }

    @Override
    public void delete(String s) {
        this.fines.remove(s);
    }

    @Override
    public Fine read(String s) {
        return this.fines.get(s);
    }

    @Override
    public Set<Fine> getAll() {
        Collection<Fine> fines = this.fines.values();
        HashSet<Fine> set = new HashSet<>();
        set.addAll(fines);
        return set;
    }
}
