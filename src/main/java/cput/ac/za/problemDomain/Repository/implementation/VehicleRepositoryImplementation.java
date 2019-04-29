package cput.ac.za.problemDomain.Repository.implementation;

import cput.ac.za.problemDomain.Repository.VehicleRepository;
import cput.ac.za.problemDomain.domain.transport.Vehicle;

import java.util.HashSet;
import java.util.Set;

public class VehicleRepositoryImplementation implements VehicleRepository {

    private static VehicleRepositoryImplementation repository = null;
    private Set<Vehicle> vehicles;

    public static VehicleRepositoryImplementation getInstance()
    {
        if (repository == null)
            repository = new VehicleRepositoryImplementation();
        return repository;
    }


    private VehicleRepositoryImplementation() {

        this.vehicles = new HashSet<>();
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        this.vehicles.add(vehicle);
        return vehicle;
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Vehicle read(String s) {
        return null;
    }

    public Set<Vehicle> getAll()
    {
        return this.vehicles;
    }
}
