package cput.ac.za.problemDomain.factory.document;

import cput.ac.za.problemDomain.domain.document.Licence;
import org.junit.Assert;
import org.junit.Test;

public class LicenceFactoryTest {

    @Test
    public void createLicense() {

//        CREATE A CAR LICENCE
        Licence licence1 = LicenceFactory.createLicense("car");
//        CREATE A HEAVY DUTY LICENCE
        Licence licence2 = LicenceFactory.createLicense("heavy");
//        CREATE A TAXI LICENCE
        Licence licence3 = LicenceFactory.createLicense("taxi");
//        CREATE A MOTO BIKE LICENCE
        Licence licence4 = LicenceFactory.createLicense("moto");

//        DISPLAY LICENCES
        System.out.println(licence1.toString());
        System.out.println(licence2.toString());
        System.out.println(licence3.toString());
        System.out.println(licence4.toString());

//        IF OBJECT IS NULL
        Assert.assertNotNull(licence1);
        Assert.assertNotNull(licence2);
        Assert.assertNotNull(licence3);
        Assert.assertNotNull(licence4);

//        IF OBJECT ARE DIFFERENT
        Assert.assertNotEquals(licence1, licence2);
        Assert.assertNotEquals(licence3, licence4);
        System.out.println("Objects are different");

//        IF OBJECTS ARE EQUAL
//        Assert.assertEquals(licence1, licence2);
//        Assert.assertEquals(licence3, licence4);
//        System.out.println("Objects are the same");


    }
}