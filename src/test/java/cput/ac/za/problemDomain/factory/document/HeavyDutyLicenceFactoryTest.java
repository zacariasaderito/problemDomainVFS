package cput.ac.za.problemDomain.factory.document;

import cput.ac.za.problemDomain.domain.document.HeavyDutyLicence;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeavyDutyLicenceFactoryTest {

    @Test
    public void getInsurance() {
        HeavyDutyLicence heavyDutyLicence1 = HeavyDutyLicenceFactory.getInsurance("car");
    HeavyDutyLicence heavyDutyLicence2 = HeavyDutyLicenceFactory.getInsurance("taxi");

        System.out.println(heavyDutyLicence1.toString());
        System.out.println(heavyDutyLicence1.getLicenceNumber());

        System.out.println(heavyDutyLicence2.toString());
        System.out.println(heavyDutyLicence2.getLicenceNumber());

//        IF OBJECTS ARE NULL
        Assert.assertNotNull(heavyDutyLicence1);
        Assert.assertNotNull(heavyDutyLicence2);
        System.out.println("Objects are NOT null");

//       IF OBJECTS ARE DIFFERENT
        Assert.assertNotEquals(heavyDutyLicence1, heavyDutyLicence2);
        System.out.println("Objects are different");

//        IF OBJECTS ARE EQUAL
//        Assert.assertEquals(insurance1,insurance2);
//        System.out.println("Objects are the same");
    }

}
