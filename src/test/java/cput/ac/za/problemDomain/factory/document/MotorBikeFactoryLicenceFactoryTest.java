package cput.ac.za.problemDomain.factory.document;

import cput.ac.za.problemDomain.domain.document.MotorbikeLicence;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MotorBikeFactoryLicenceFactoryTest {

    @Test
    public void getInsurance() {
        MotorbikeLicence motorbikeLicence1 = MotorBikeLicenceFactory.getInsurance("car");
        MotorbikeLicence motorbikeLicence2 = MotorBikeLicenceFactory.getInsurance("taxi");

        System.out.println(motorbikeLicence1.toString());
        System.out.println(motorbikeLicence1.getLicenceNumber());

        System.out.println(motorbikeLicence2.toString());
        System.out.println(motorbikeLicence2.getLicenceNumber());

//        IF OBJECTS ARE NULL
        Assert.assertNotNull(motorbikeLicence1);
        Assert.assertNotNull(motorbikeLicence2);
        System.out.println("Objects are NOT null");

//       IF OBJECTS ARE DIFFERENT
        Assert.assertNotEquals(motorbikeLicence1, motorbikeLicence2);
        System.out.println("Objects are different");

//        IF OBJECTS ARE EQUAL
//        Assert.assertEquals(insurance1,insurance2);
//        System.out.println("Objects are the same");
    }

}