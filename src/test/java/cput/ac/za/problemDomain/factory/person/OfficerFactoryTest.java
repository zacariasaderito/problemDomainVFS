package cput.ac.za.problemDomain.factory.person;

import cput.ac.za.problemDomain.domain.person.Officer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OfficerFactoryTest {

    @Test
    public void getOfficer() {

        Officer officer1 = OfficerFactory.getOfficer("Inacio", "Traffic" );
        Officer officer2 = OfficerFactory.getOfficer("Inacio", "Traffic" );

        System.out.println(officer1.toString());
        System.out.println(officer2.toString());

//        IF OBJECTS ARE NULL
        Assert.assertNotNull(officer1);
        Assert.assertNotNull(officer2);
        System.out.println("Objects are NOT null");

//        IF OBJECTS ARE DIFFERENT
        Assert.assertNotEquals(officer1, officer2);
        System.out.println("Objects are different");

//        IF OBJECTS ARE EQUAL
//        Assert.assertEquals(officer1, officer2);
//        System.out.println("Objects are the same");


    }
}