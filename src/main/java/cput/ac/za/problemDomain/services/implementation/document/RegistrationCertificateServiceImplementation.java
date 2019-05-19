package cput.ac.za.problemDomain.services.implementation.document;

import cput.ac.za.problemDomain.Repository.Interfaces.document.RegistrationCertificateRepository;
import cput.ac.za.problemDomain.Repository.implementation.document.RegistrationCertificateRepositoryImplementation;
import cput.ac.za.problemDomain.domain.document.RegistrationCertificate;
import cput.ac.za.problemDomain.services.interfaces.document.RegistrationCertificateService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RegistrationCertificateServiceImplementation implements RegistrationCertificateService {

    //    @Autowired
//    @Qualifier("InMemory")
    private RegistrationCertificateRepository repository;
    private static RegistrationCertificateServiceImplementation service = null;

    private RegistrationCertificateServiceImplementation() {
        this.repository = RegistrationCertificateRepositoryImplementation.getRepository();
    }

    public static RegistrationCertificateServiceImplementation getService() {
        if (service == null)
            service = new RegistrationCertificateServiceImplementation();

        return service;
    }

    @Override
    public RegistrationCertificate create(RegistrationCertificate registrationCertificate) {
        return repository.create(registrationCertificate);
    }

    @Override
    public RegistrationCertificate update(RegistrationCertificate registrationCertificate) {
        return repository.update(registrationCertificate);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public RegistrationCertificate read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<RegistrationCertificate> getAll() {
        return this.repository.getAll();
    }

}
