//package cput.ac.za.problemDomain.Repository.implementation.feature;
//
//import cput.ac.za.problemDomain.Repository.Interfaces.feature.WarrantRepository;
//import cput.ac.za.problemDomain.domain.feature.Warrant;
//
//import java.util.*;
//
//public class WarrantRepositoryImplementation implements WarrantRepository {
//
//
//    private static WarrantRepositoryImplementation repository = null;
//    private Map<String, Warrant> warrants;
//
//    public static WarrantRepositoryImplementation getRepository() {
//        if (repository == null)
//            repository = new WarrantRepositoryImplementation();
//        return repository;
//    }
//
//    private WarrantRepositoryImplementation() {
//        this.warrants = new HashMap<>();
//    }
//
//
//    @Override
//    public Warrant create(Warrant warrant) {
//        this.warrants.put(warrant.getWarrantNumber(), warrant);
//        return warrant;
//    }
//
//    @Override
//    public Warrant update(Warrant warrant) {
//        this.warrants.replace(warrant.getWarrantNumber(), warrant);
//        return this.warrants.get(warrant.getWarrantNumber());
//    }
//
//    @Override
//    public void delete(String s) {
//        warrants.remove(s);
//    }
//
//    @Override
//    public Warrant read(String s) {
//        return this.warrants.get(s);
//    }
//
//    @Override
//    public Set<Warrant> getAll() {
//        Collection<Warrant> warrants = this.warrants.values();
//        HashSet<Warrant> set = new HashSet<>();
//        set.addAll(warrants);
//        return set;
//    }
//}
