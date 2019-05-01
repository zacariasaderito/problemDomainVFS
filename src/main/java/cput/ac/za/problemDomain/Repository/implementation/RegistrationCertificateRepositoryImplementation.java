package cput.ac.za.problemDomain.Repository.implementation;

import cput.ac.za.problemDomain.Repository.RegistrationCertificateRepository;
import cput.ac.za.problemDomain.domain.document.RegistrationCertificate;

import java.util.HashSet;
import java.util.Set;

public class RegistrationCertificateRepositoryImplementation implements RegistrationCertificateRepository {

    private static RegistrationCertificateRepositoryImplementation repository = null;
    private Set<RegistrationCertificate> registrationCertificates;

    public static RegistrationCertificateRepositoryImplementation getRepository() {
        if (repository == null)
            repository = new RegistrationCertificateRepositoryImplementation();
        return repository;
    }

    private RegistrationCertificateRepositoryImplementation() {
        this.registrationCertificates = new HashSet<>();
    }

    @Override
    public RegistrationCertificate create(RegistrationCertificate registrationCertificate) {
        return null;
    }

    @Override
    public RegistrationCertificate update(RegistrationCertificate registrationCertificate) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public RegistrationCertificate read(String s) {
        return null;
    }
}
