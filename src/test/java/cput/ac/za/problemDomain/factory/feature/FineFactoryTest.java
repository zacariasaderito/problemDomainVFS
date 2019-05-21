package cput.ac.za.problemDomain.factory.feature;

import cput.ac.za.problemDomain.domain.feature.Fine;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FineFactoryTest {

    @Test
    public void getFine() {

        Fine fine1 = FineFactory.getFine("To be paid", 12345, 200);
        Fine fine2 = FineFactory.getFine("To be paid", 12345, 200);

        System.out.println(fine1.toString());
        System.out.println(fine2.toString());

//        IF OBJECTS ARE NULL
        Assert.assertNotNull(fine1);
        Assert.assertNotNull(fine2);
        System.out.println("Objects are NOT null");

//        IF OBJECTS ARE DIFFERENT
        Assert.assertNotEquals(fine1, fine2);
        System.out.println("Objects are different");

//        IF OBJECTS ARE EQUAL
//        Assert.assertEquals(fine1,fine2);
//        System.out.println("Objects are the same");


    }
}