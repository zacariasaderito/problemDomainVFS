package cput.ac.za.problemDomain.factory.transport;

import cput.ac.za.problemDomain.domain.document.Licence;
import cput.ac.za.problemDomain.domain.person.Driver;
import cput.ac.za.problemDomain.domain.transport.Taxi;
import cput.ac.za.problemDomain.factory.document.LicenceFactory;
import cput.ac.za.problemDomain.factory.person.DriverFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaxiFactoryTest {

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

        Taxi taxi1 = TaxiFactory.getInsurance("car", this.driver1, "Red", "BMW");
        Taxi taxi2 = TaxiFactory.getInsurance("car", this.driver2, "Black", "TOYOTA");

        System.out.println(taxi1.toString());
        System.out.println("Driver1");
        System.out.println(this.driver1.toString());
        System.out.println("");

        System.out.println("Driver2");
        System.out.println(taxi2.toString());
        System.out.println(this.driver2.toString());
        System.out.println("");

//        IF OBJECTS ARE NULL
//        Drivers
        Assert.assertNotNull(this.driver1);
        Assert.assertNotNull(this.driver2);
//        Cars
        Assert.assertNotNull(taxi1);
        Assert.assertNotNull(taxi2);
        System.out.println("Objects are NOT null");

//       IF OBJECTS ARE DIFFERENT
        Assert.assertNotEquals(taxi1, taxi2);
        System.out.println("Objects are different");

//        IF OBJECTS ARE EQUAL
//        Assert.assertEquals(taxi1, taxi2);
//        System.out.println("Objects are the same");

    }


}