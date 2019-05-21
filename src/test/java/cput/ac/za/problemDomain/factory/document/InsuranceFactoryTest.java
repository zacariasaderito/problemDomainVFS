package cput.ac.za.problemDomain.factory.document;

import cput.ac.za.problemDomain.domain.document.Insurance;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsuranceFactoryTest {

    @Test
    public void getInsurance() {

        Insurance insurance1 = InsuranceFactory.getInsurance(200, "Not Payed", true, 121212);
        Insurance insurance2 = InsuranceFactory.getInsurance(200, "Not Payed", true, 121212);

        System.out.println(insurance1.toString());
        System.out.println(insurance1.getInsuranceNumber());

        System.out.println(insurance2.toString());
        System.out.println(insurance2.getInsuranceNumber());

//        IF OBJECTS ARE NULL
        Assert.assertNotNull(insurance1);
        Assert.assertNotNull(insurance2);
        System.out.println("Objects are NOT null");

//       IF OBJECTS ARE DIFFERENT
        Assert.assertNotEquals(insurance1, insurance2);
        System.out.println("Objects are different");

//        IF OBJECTS ARE EQUAL
//        Assert.assertEquals(insurance1,insurance2);
//        System.out.println("Objects are the same");
    }
}