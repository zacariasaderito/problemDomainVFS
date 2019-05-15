package cput.ac.za.problemDomain.Repository.implementation.document;

import cput.ac.za.problemDomain.Repository.Interfaces.document.RoadTaxRepository;
import cput.ac.za.problemDomain.domain.document.RoadTax;

import java.util.HashSet;
import java.util.Set;

public class RoadTaxRepositoryImplementation implements RoadTaxRepository {


    private static RoadTaxRepositoryImplementation repository = null;
    private Set<RoadTax> roadTaxes;

    public static RoadTaxRepositoryImplementation getRepository() {
        if (repository == null)
            repository = new RoadTaxRepositoryImplementation();
        return repository;
    }

    private RoadTaxRepositoryImplementation() {
        this.roadTaxes = new HashSet<>();
    }


    @Override
    public RoadTax create(RoadTax roadTax) {
        return null;
    }

    @Override
    public RoadTax update(RoadTax roadTax) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public RoadTax read(String s) {
        return null;
    }
}
