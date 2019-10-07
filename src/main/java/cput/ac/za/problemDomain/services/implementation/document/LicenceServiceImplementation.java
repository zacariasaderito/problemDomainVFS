package cput.ac.za.problemDomain.services.implementation.document;

import cput.ac.za.problemDomain.Repository.Interfaces.document.LicenceRepository;
import cput.ac.za.problemDomain.domain.document.Licence;
import cput.ac.za.problemDomain.services.interfaces.document.LicenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenceServiceImplementation implements LicenceService {

    @Autowired
    private LicenceRepository repository;
    private static LicenceServiceImplementation service = null;

    private LicenceServiceImplementation(){}

    public static LicenceServiceImplementation getService() {
        if (service == null)
            service = new LicenceServiceImplementation();

        return service;
    }

    @Override
    public Licence create(Licence licence) {
        return repository.create(licence);
    }

    @Override
    public Licence update(Licence licence) {
        return repository.update(licence);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Licence read(String s) {
        return repository.read(s);
    }

    @Override
    public List<Licence> getAll() {
        return this.repository.getAll();
    }
}
