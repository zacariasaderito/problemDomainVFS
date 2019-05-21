package cput.ac.za.problemDomain.factory.document;

import cput.ac.za.problemDomain.domain.document.CarLicence;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarLicenceFactoryTest {

    @Test
    public void getInsurance() {

        CarLicence carLicence1 = CarLicenceFactory.getInsurance("car");
        CarLicence carLicence2 = CarLicenceFactory.getInsurance("taxi");

        System.out.println(carLicence1.toString());
        System.out.println(carLicence1.getLicenseNumber());

        System.out.println(carLicence2.toString());
        System.out.println(carLicence2.getLicenseNumber());

//        IF OBJECTS ARE NULL
        Assert.assertNotNull(carLicence1);
        Assert.assertNotNull(carLicence2);
        System.out.println("Objects are NOT null");

//       IF OBJECTS ARE DIFFERENT
        Assert.assertNotEquals(carLicence1, carLicence2);
        System.out.println("Objects are different");

//        IF OBJECTS ARE EQUAL
//        Assert.assertEquals(insurance1,insurance2);
//        System.out.println("Objects are the same");
    }

}