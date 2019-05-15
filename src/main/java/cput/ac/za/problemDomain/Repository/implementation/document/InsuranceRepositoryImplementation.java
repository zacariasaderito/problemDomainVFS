package cput.ac.za.problemDomain.Repository.implementation.document;

import cput.ac.za.problemDomain.Repository.Interfaces.document.InsuranceRepository;
import cput.ac.za.problemDomain.domain.document.Insurance;

import java.util.HashSet;
import java.util.Set;

public class InsuranceRepositoryImplementation implements InsuranceRepository {


    private static InsuranceRepositoryImplementation repository = null;
    private Set<Insurance> insurances;

    public static InsuranceRepositoryImplementation getRepository() {
        if (repository == null)
            repository = new InsuranceRepositoryImplementation();
        return repository;
    }

    private InsuranceRepositoryImplementation() {
        this.insurances = new HashSet<>();
    }



    @Override
    public Insurance create(Insurance insurance) {
        return null;
    }

    @Override
    public Insurance update(Insurance insurance) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Insurance read(String s) {
        return null;
    }
}
