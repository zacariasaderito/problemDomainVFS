package cput.ac.za.problemDomain.TestFactoty;

import cput.ac.za.problemDomain.domain.transport.Vehicle;
import cput.ac.za.problemDomain.factory.VehicleFactory;
import org.junit.Test;

public class TestVehicleFactory {

    @Test
    public void CreateVehicle()
    {
        Vehicle vehicle = VehicleFactory.createVehicle("taxi");

        vehicle.showVehicle();
    }

}
