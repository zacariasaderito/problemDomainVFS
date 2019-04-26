package cput.ac.za.problemDomain.TestFactoty;

import cput.ac.za.problemDomain.Domain.Vehicle;
import cput.ac.za.problemDomain.Factory.VehicleFactory;
import org.junit.Test;

public class TestVehicleFactory {

    @Test
    public void CreateVehicle()
    {
        Vehicle vehicle = VehicleFactory.createVehicle("taxi");

        vehicle.showVehicle();
    }

}
