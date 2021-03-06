package cput.ac.za.problemDomain.factory.transport;

import cput.ac.za.problemDomain.domain.document.Licence;
import cput.ac.za.problemDomain.domain.person.Driver;
import cput.ac.za.problemDomain.domain.transport.Vehicle;
import cput.ac.za.problemDomain.factory.document.LicenceFactory;
import cput.ac.za.problemDomain.factory.person.DriverFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleFactoryTest {

    private Driver driver1;
    private Driver driver2;

    @Before
    public void setUp() throws Exception {
        // make that a before.  GIVE IT A VALUE
        Licence licence1 = LicenceFactory.createLicense("taxi");
        this.driver1 = DriverFactory.getDriver("Aderito", 22, "73 Wallace Street", 1111111111, licence1);
        Licence licence2 = LicenceFactory.createLicense("heavy");
        this.driver2 = DriverFactory.getDriver("Aderito", 22, "73 Wallace Street", 1111111111, licence2);
    }

    @Test
    public void getInsurance() {

        Vehicle vehicle1 = VehicleFactory.createVehicle("car", this.driver1, "Red", "BMW");
        Vehicle vehicle2 = VehicleFactory.createVehicle("heavy", this.driver2, "Black", "TOYOTA");
        Vehicle vehicle3 = VehicleFactory.createVehicle("taxi", this.driver2, "Red", "BMW");
        Vehicle vehicle4 = VehicleFactory.createVehicle("moto", this.driver1, "Black", "TOYOTA");


//        Driver1 has 2 VEHICLES: 1 / 4
        System.out.println(vehicle1.toString());
        System.out.println("Driver1");
        System.out.println(this.driver1.toString());
        System.out.println("");

        System.out.println(vehicle4.toString());
        System.out.println("Driver1");
        System.out.println(this.driver1.toString());
        System.out.println("");

//        Driver2 has 2 VEHICLES: 2 / 3
        System.out.println(vehicle2.toString());
        System.out.println("Driver2");
        System.out.println(this.driver2.toString());
        System.out.println("");

        System.out.println(vehicle3.toString());
        System.out.println("Driver2");
        System.out.println(this.driver2.toString());
        System.out.println("");


//        IF OBJECTS ARE NULL
//        Drivers
        Assert.assertNotNull(this.driver1);
        Assert.assertNotNull(this.driver2);
//        Cars
        Assert.assertNotNull(vehicle1);
        Assert.assertNotNull(vehicle2);
        Assert.assertNotNull(vehicle3);
        Assert.assertNotNull(vehicle4);
        System.out.println("Objects are NOT null");

//       IF OBJECTS ARE DIFFERENT
        Assert.assertNotEquals(vehicle1, vehicle4);
        Assert.assertNotEquals(vehicle2, vehicle3);
        System.out.println("Objects are different");

//        IF OBJECTS ARE EQUAL
//        Assert.assertEquals(car1, car2);
//        System.out.println("Objects are the same");

    }
}