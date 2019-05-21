package cput.ac.za.problemDomain.factory.document;

import cput.ac.za.problemDomain.domain.document.TaxiLicense;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaxiLicenceFactoryTest {

    @Test
    public void getInsurance() {
        TaxiLicense taxiLicense1 = TaxiLicenceFactory.getInsurance("car");
        TaxiLicense taxiLicense2 = TaxiLicenceFactory.getInsurance("taxi");

        System.out.println(taxiLicense1.toString());
        System.out.println(taxiLicense1.getLicenceNumber());

        System.out.println(taxiLicense2.toString());
        System.out.println(taxiLicense2.getLicenceNumber());

//        IF OBJECTS ARE NULL
        Assert.assertNotNull(taxiLicense1);
        Assert.assertNotNull(taxiLicense2);
        System.out.println("Objects are NOT null");

//       IF OBJECTS ARE DIFFERENT
        Assert.assertNotEquals(taxiLicense1, taxiLicense2);
        System.out.println("Objects are different");

//        IF OBJECTS ARE EQUAL
//        Assert.assertEquals(insurance1,insurance2);
//        System.out.println("Objects are the same");
    }

}