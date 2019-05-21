package cput.ac.za.problemDomain.factory.feature;

import cput.ac.za.problemDomain.domain.document.Licence;
import cput.ac.za.problemDomain.domain.feature.Warrant;
import cput.ac.za.problemDomain.domain.person.Driver;
import cput.ac.za.problemDomain.factory.document.LicenceFactory;
import cput.ac.za.problemDomain.factory.person.DriverFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WarrantFactoryTest {

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
    public void getWarrant() {



        Warrant warrant1 = WarrantFactory.getWarrant("Fine not paid", 12345, this.driver1);
        Warrant warrant2 = WarrantFactory.getWarrant("Fine not paid", 12345, this.driver2);

        System.out.println(warrant1.toString());
        System.out.println("Driver1");
        System.out.println(this.driver1.toString());
        System.out.println("");

        System.out.println("Driver2");
        System.out.println(warrant2.toString());
        System.out.println(this.driver2.toString());
        System.out.println("");


//        IF OBJECTS ARE NULL
//        Drivers
        Assert.assertNotNull(this.driver1);
        Assert.assertNotNull(this.driver2);
//        Warrants
        Assert.assertNotNull(warrant1);
        Assert.assertNotNull(warrant2);
        System.out.println("Objects are NOT null");

//        IF OBJECTS ARE DIFFERENT
        Assert.assertNotEquals(warrant1, warrant2);
        System.out.println("Objects are different");

//        IF OBJECTS ARE EQUAL
//        Assert.assertEquals(warrant1, warrant2);
//        System.out.println("Objects are the same");

    }
}