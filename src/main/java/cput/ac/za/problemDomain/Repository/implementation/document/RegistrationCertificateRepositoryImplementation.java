package cput.ac.za.problemDomain.Repository.implementation.document;

import cput.ac.za.problemDomain.Repository.Interfaces.document.RegistrationCertificateRepository;
import cput.ac.za.problemDomain.domain.document.RegistrationCertificate;

import java.util.*;

public class RegistrationCertificateRepositoryImplementation implements RegistrationCertificateRepository {

    private static RegistrationCertificateRepositoryImplementation repository = null;
    private Map<String, RegistrationCertificate> registrationCertificates;

    public static RegistrationCertificateRepositoryImplementation getRepository() {
        if (repository == null)
            repository = new RegistrationCertificateRepositoryImplementation();
        return repository;
    }

    private RegistrationCertificateRepositoryImplementation() {
        this.registrationCertificates = new HashMap<>();
    }

    @Override
    public RegistrationCertificate create(RegistrationCertificate registrationCertificate) {
        this.registrationCertificates.put(registrationCertificate.getRegistrationNumber(), registrationCertificate);
        return registrationCertificate;
    }

    @Override
    public RegistrationCertificate update(RegistrationCertificate registrationCertificate) {
        this.registrationCertificates.replace(registrationCertificate.getRegistrationNumber(), registrationCertificate);
        return this.registrationCertificates.get(registrationCertificate.getRegistrationNumber());
    }

    @Override
    public void delete(String s) {
        this.registrationCertificates.remove(s);
    }

    @Override
    public RegistrationCertificate read(String s) {
        return this.registrationCertificates.get(s);
    }

    @Override
    public Set<RegistrationCertificate> getAll() {
        Collection<RegistrationCertificate> registrationCertificates = this.registrationCertificates.values();
        HashSet<RegistrationCertificate> set = new HashSet<>();
        set.addAll(registrationCertificates);
        return set;
    }
}
