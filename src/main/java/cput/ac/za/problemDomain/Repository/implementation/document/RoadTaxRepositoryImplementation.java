package cput.ac.za.problemDomain.Repository.implementation.document;

import cput.ac.za.problemDomain.Repository.Interfaces.document.RoadTaxRepository;
import cput.ac.za.problemDomain.domain.document.RoadTax;

import java.util.*;

public class RoadTaxRepositoryImplementation implements RoadTaxRepository {


    private static RoadTaxRepositoryImplementation repository = null;
    private Map<String, RoadTax> roadTaxes;

    public static RoadTaxRepositoryImplementation getRepository() {
        if (repository == null)
            repository = new RoadTaxRepositoryImplementation();
        return repository;
    }

    private RoadTaxRepositoryImplementation() {
        this.roadTaxes = new HashMap<>();
    }


    @Override
    public RoadTax create(RoadTax roadTax) {
        this.roadTaxes.put(roadTax.getTaxNumber(), roadTax);
        return roadTax;
    }

    @Override
    public RoadTax update(RoadTax roadTax) {
        this.roadTaxes.replace(roadTax.getTaxNumber(), roadTax);
        return this.roadTaxes.get(roadTax.getTaxNumber());
    }

    @Override
    public void delete(String s) {
        this.roadTaxes.remove(s);
    }

    @Override
    public RoadTax read(String s) {
        return this.roadTaxes.get(s);
    }

    @Override
    public Set<RoadTax> getAll() {
        Collection<RoadTax> roadTaxes = this.roadTaxes.values();
        HashSet<RoadTax> set = new HashSet<>();
        set.addAll(roadTaxes);
        return set;
    }
}
