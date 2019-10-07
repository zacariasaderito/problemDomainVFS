//package cput.ac.za.problemDomain.Repository.implementation.transport;
//
//import cput.ac.za.problemDomain.Repository.Interfaces.transport.VehicleRepository;
//import cput.ac.za.problemDomain.domain.transport.Vehicle;
//
//import java.util.*;
//
//public class VehicleRepositoryImplementation implements VehicleRepository {
//
//    private static VehicleRepositoryImplementation repository = null;
//    private Map<String, Vehicle> vehicles;
//
//    public static VehicleRepositoryImplementation getRepository()
//    {
//        if (repository == null)
//            repository = new VehicleRepositoryImplementation();
//        return repository;
//    }
//
//
//    private VehicleRepositoryImplementation() {
//        this.vehicles = new HashMap<>();
//    }
//
//    @Override
//    public Vehicle create(Vehicle vehicle) {
////        this.vehicles.put(vehicle.getPlateNumber(), vehicle);
//        return vehicle;
//    }
//
//    @Override
//    public Vehicle update(Vehicle vehicle) {
////        this.vehicles.replace(vehicle.getPlateNumber(), vehicle);
////        return this.vehicles.get(vehicle.getPlateNumber());
//        return null;
//    }
//
//    @Override
//    public void delete(String s) {
//        this.vehicles.remove(s);
//    }
//
//    @Override
//    public Vehicle read(String s) {
//        return this.vehicles.get(s);
//    }
//
//    @Override
//    public Set<Vehicle> getAll() {
//        Collection<Vehicle> vehicles = this.vehicles.values();
//        HashSet<Vehicle> set = new HashSet<>();
//        set.addAll(vehicles);
//        return set;
//    }
//}
