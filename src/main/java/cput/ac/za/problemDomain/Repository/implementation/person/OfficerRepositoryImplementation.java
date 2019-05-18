package cput.ac.za.problemDomain.Repository.implementation.person;

import cput.ac.za.problemDomain.Repository.Interfaces.person.OfficerRepository;
import cput.ac.za.problemDomain.domain.person.Officer;

import java.util.*;

public class OfficerRepositoryImplementation implements OfficerRepository {

    private static OfficerRepositoryImplementation repository = null;
    private Map<String, Officer> officers;

    public static OfficerRepositoryImplementation getRepository() {
        if (repository == null)
            repository = new OfficerRepositoryImplementation();
        return repository;
    }

    private OfficerRepositoryImplementation() {
        this.officers = new HashMap<>();
    }


    @Override
    public Officer create(Officer officer) {
        this.officers.put(officer.getOfficerID(), officer);
        return officer;
    }

    @Override
    public Officer update(Officer officer) {
        this.officers.replace(officer.getOfficerID(), officer);
        return this.officers.get(officer.getOfficerID());
    }

    @Override
    public void delete(String s) {
        this.officers.remove(s);
    }

    @Override
    public Officer read(String s) {
        return this.officers.get(s);
    }

    @Override
    public Set<Officer> getAll() {
        Collection<Officer> officers = this.officers.values();
        HashSet<Officer> set = new HashSet<>();
        set.addAll(officers);
        return null;
    }

}
