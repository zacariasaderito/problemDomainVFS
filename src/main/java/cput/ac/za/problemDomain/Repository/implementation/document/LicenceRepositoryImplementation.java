package cput.ac.za.problemDomain.Repository.implementation.document;

import cput.ac.za.problemDomain.Repository.Interfaces.document.LicenceRepository;
import cput.ac.za.problemDomain.domain.document.Licence;

import java.util.HashSet;
import java.util.Set;

public class LicenceRepositoryImplementation implements LicenceRepository {

    private static LicenceRepositoryImplementation repository = null;
    private Set<Licence> licences;

    public static LicenceRepositoryImplementation getRepository() {
        if (repository == null)
            repository = new LicenceRepositoryImplementation();
        return repository;
    }

    private LicenceRepositoryImplementation() {
        this.licences = new HashSet<>();
    }


    @Override
    public Licence create(Licence licence) {
        return null;
    }

    @Override
    public Licence update(Licence licence) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Licence read(String s) {
        return null;
    }
}
