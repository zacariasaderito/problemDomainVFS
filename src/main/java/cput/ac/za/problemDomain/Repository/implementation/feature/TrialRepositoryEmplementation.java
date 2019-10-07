//package cput.ac.za.problemDomain.Repository.implementation.feature;
//
//import cput.ac.za.problemDomain.Repository.Interfaces.feature.TrialRepository;
//import cput.ac.za.problemDomain.domain.feature.Trial;
//
//import java.util.*;
//
//public class TrialRepositoryEmplementation implements TrialRepository {
//
//
//    private static TrialRepositoryEmplementation repository = null;
//    private Map<String, Trial> trials;
//
//    public static TrialRepositoryEmplementation getRepository() {
//        if (repository == null)
//            repository = new TrialRepositoryEmplementation();
//        return repository;
//    }
//
//    private TrialRepositoryEmplementation() {
//        this.trials = new HashMap<>();
//    }
//
//
//    @Override
//    public Trial create(Trial trial) {
//        this.trials.put(trial.getRequestNumber(), trial);
//        return trial;
//    }
//
//    @Override
//    public Trial update(Trial trial) {
//        this.trials.replace(trial.getRequestNumber(), trial);
//        return this.trials.get(trial.getRequestNumber());
//    }
//
//    @Override
//    public void delete(String s) {
//        this.trials.remove(s);
//    }
//
//    @Override
//    public Trial read(String s) {
//        return this.trials.get(s);
//    }
//
//    @Override
//    public Set<Trial> getAll() {
//        Collection<Trial> trials = this.trials.values();
//        HashSet<Trial> set = new HashSet<>();
//        set.addAll(trials);
//        return set;
//    }
//}
