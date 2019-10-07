package cput.ac.za.problemDomain.services.implementation.document;

import cput.ac.za.problemDomain.Repository.Interfaces.document.RoadTaxRepository;
import cput.ac.za.problemDomain.domain.document.RoadTax;
import cput.ac.za.problemDomain.services.interfaces.document.RoadTaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class RoadTaxServiceImplementation implements RoadTaxService {

    @Autowired
    private RoadTaxRepository repository;
    private static RoadTaxServiceImplementation service = null;

    private RoadTaxServiceImplementation() {
   }

    public static RoadTaxServiceImplementation getService() {
        if (service == null)
            service = new RoadTaxServiceImplementation();

        return service;
    }

    @Override
    public RoadTax create(RoadTax roadTax) {
        return repository.create(roadTax);
    }

    @Override
    public RoadTax update(RoadTax roadTax) {
        return repository.update(roadTax);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public RoadTax read(String s) {
        return repository.read(s);
    }

    @Override
    public List<RoadTax> getAll() {
        return this.repository.getAll();
    }

}
