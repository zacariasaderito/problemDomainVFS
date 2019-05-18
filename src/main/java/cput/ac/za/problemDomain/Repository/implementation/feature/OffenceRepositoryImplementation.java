package cput.ac.za.problemDomain.Repository.implementation.feature;

import cput.ac.za.problemDomain.Repository.Interfaces.feature.OffenceRepository;
import cput.ac.za.problemDomain.domain.feature.Offence;

import java.util.*;

public class OffenceRepositoryImplementation implements OffenceRepository {


    private static OffenceRepositoryImplementation repository = null;
    private Map<String , Offence> offences;

    public static OffenceRepositoryImplementation getRepository() {
        if (repository == null)
            repository = new OffenceRepositoryImplementation();
        return repository;
    }

    private OffenceRepositoryImplementation() {
        this.offences = new HashMap<>();
    }

    @Override
    public Offence create(Offence offence) {
        this.offences.put(offence.getOffenceId(), offence);
        return offence;
    }

    @Override
    public Offence update(Offence offence) {
        this.offences.replace(offence.getOffenceId(), offence);
        return null;
    }

    @Override
    public void delete(String s) {
        this.offences.remove(s);
    }

    @Override
    public Offence read(String s) {
        return this.offences.get(s);
    }

    @Override
    public Set<Offence> getAll() {
        Collection<Offence> offences = this.offences.values();
        HashSet<Offence> set = new HashSet<>();
        set.addAll(offences);
        return set;
    }
}
