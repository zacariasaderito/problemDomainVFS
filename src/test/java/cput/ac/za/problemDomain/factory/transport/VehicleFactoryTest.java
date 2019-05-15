package cput.ac.za.problemDomain.factory.transport;

import cput.ac.za.problemDomain.domain.transport.Vehicle;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleFactoryTest {

    @Test
    public void createVehicle() {

        Vehicle vehicle = VehicleFactory.createVehicle("taxi");

        vehicle.showVehicle();

    }
}