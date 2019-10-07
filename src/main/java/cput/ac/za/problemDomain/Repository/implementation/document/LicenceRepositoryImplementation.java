//package cput.ac.za.problemDomain.Repository.implementation.document;
//
//import cput.ac.za.problemDomain.Repository.Interfaces.document.LicenceRepository;
//import cput.ac.za.problemDomain.domain.document.Licence;
//
//import java.util.*;
//
//public class LicenceRepositoryImplementation implements LicenceRepository {
//
//    private static LicenceRepositoryImplementation repository = null;
//    private Map<String, Licence> licences;
//
//    public static LicenceRepositoryImplementation getRepository() {
//        if (repository == null)
//            repository = new LicenceRepositoryImplementation();
//        return repository;
//    }
//
//    private LicenceRepositoryImplementation() {
//        this.licences = new HashMap<>();
//    }
//
//
//    @Override
//    public Licence create(Licence licence) {
////        this.licences.put(licence.getLicenseNumber(), licence);
//        return licence;
//    }
//
//    @Override
//    public Licence update(Licence licence) {
////        this.licences.replace(licence.getLicenseNumber(), licence);
////        return this.licences.get(licence.getLicenseNumber());
//        return null;
//    }
//
//    @Override
//    public void delete(String s) {
//        this.licences.remove(s);
//    }
//
//    @Override
//    public Licence read(String s) {
//        return this.licences.get(s);
//    }
//
//    @Override
//    public Set<Licence> getAll() {
//        Collection<Licence> licences = this.licences.values();
//        HashSet<Licence> set = new HashSet<>();
//        set.addAll(licences);
//        return set;
//    }
//
//}
