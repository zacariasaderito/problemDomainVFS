package cput.ac.za.problemDomain.factory.person;

import cput.ac.za.problemDomain.domain.document.Licence;
import cput.ac.za.problemDomain.domain.person.Driver;
import cput.ac.za.problemDomain.factory.document.LicenceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DriverFactoryTest {

//    CLASSES NEEDED FOR TEST
    private Licence licence;

    @Before
    public void setUp() throws Exception {

        this.licence = LicenceFactory.createLicense("taxi");
    }

    @Test
    public void getDriver() {

        Driver driver1 = DriverFactory.getDriver("Aderito", 22, "73 Wallace Street", 1111111111, this.licence);
        Driver driver2 = DriverFactory.getDriver("Aderito", 22, "73 Wallace Street", 1111111111, this.licence);

        System.out.println(driver1.toString());
        System.out.println(driver2.toString());

//        CHECK LICENCE
        this.licence.showLicence();


//        IF OBJECTS ARE NULL
        Assert.assertNotNull(driver1);
        Assert.assertNotNull(driver2);
        System.out.println("Objects are NOT null");


//        IF OBJECTS ARE DIFFERENT
        Assert.assertNotEquals(driver1, driver2);
        System.out.println("Objects are different");

//        IF OBJECTS ARE EQUAL
//        Assert.assertEquals(driver1, driver2);
//        System.out.println("Objects are the same");

    }
}