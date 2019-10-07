package cput.ac.za.problemDomain.services.implementation.transport;

import cput.ac.za.problemDomain.Repository.Interfaces.transport.VehicleRepository;
import cput.ac.za.problemDomain.domain.transport.Vehicle;
import cput.ac.za.problemDomain.services.interfaces.transport.VehicleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class VehicleServiceImplementation implements VehicleService {

    //    @Autowired
//    @Qualifier("InMemory")
    private VehicleRepository repository;
    private static VehicleServiceImplementation service = null;

    private VehicleServiceImplementation() {
    }

    public static VehicleServiceImplementation getService() {
        if (service == null)
            service = new VehicleServiceImplementation();

        return service;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        return repository.create(vehicle);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return repository.update(vehicle);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Vehicle read(String s) {
        return repository.read(s);
    }

    @Override
    public List<Vehicle> getAll() {
        return this.repository.getAll();
    }

}
