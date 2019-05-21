package cput.ac.za.problemDomain.factory.feature;

import cput.ac.za.problemDomain.domain.feature.Trial;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrialFactoryTest {

    @Test
    public void getTrial() {

        Trial trial1 = TrialFactory.getTrial("Guilty");
        Trial trial2 = TrialFactory.getTrial("Guilty");

        System.out.println(trial1.toString());
        System.out.println(trial2.toString());

//        IF OBJECTS ARE NULL
        Assert.assertNotNull(trial1);
        Assert.assertNotNull(trial2);
        System.out.println("Objects are NOT null");

//        IF OBJECTS ARE DIFFERENT
        Assert.assertNotEquals(trial1, trial2);
        System.out.println("Objects are different");

//        IF OBJECTS ARE EQUAL
//        Assert.assertEquals(trial1, trial2;
//        System.out.println("Objects are the same");

    }
}