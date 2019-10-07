//package cput.ac.za.problemDomain.Repository.implementation.document;
//
//import cput.ac.za.problemDomain.Repository.Interfaces.document.InsuranceRepository;
//import cput.ac.za.problemDomain.domain.document.Insurance;
//
//import java.util.*;
//
//public class InsuranceRepositoryImplementation implements InsuranceRepository {
//
//
//    private static InsuranceRepositoryImplementation repository = null;
//    private Map<String, Insurance> insurances;
//
//    private InsuranceRepositoryImplementation() {
//        this.insurances = new HashMap<>();
//    }
//
//    public static InsuranceRepositoryImplementation getRepository() {
//        if (repository == null)
//            repository = new InsuranceRepositoryImplementation();
//        return repository;
//    }
//
//
//    @Override
//    public Insurance create(Insurance insurance) {
//        this.insurances.put(insurance.getInsuranceNumber(), insurance);
//        return insurance;
//    }
//
//    @Override
//    public Insurance update(Insurance insurance) {
//        this.insurances.replace(insurance.getInsuranceNumber(), insurance);
//        return this.insurances.get(insurance.getInsuranceNumber());
//    }
//
//    @Override
//    public void delete(String s) {
//        this.insurances.remove(s);
//    }
//
//    @Override
//    public Insurance read(String s) {
//        return this.insurances.get(s);
//    }
//
//    @Override
//    public Set<Insurance> getAll() {
//        Collection<Insurance> insurances = this.insurances.values();
//        HashSet<Insurance> set = new HashSet<>();
//        set.addAll(insurances);
//        return set;
//    }
//}
