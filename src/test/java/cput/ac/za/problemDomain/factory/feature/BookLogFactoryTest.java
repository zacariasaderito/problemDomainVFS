package cput.ac.za.problemDomain.factory.feature;

import cput.ac.za.problemDomain.domain.feature.BookLog;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookLogFactoryTest {

    @Test
    public void getBookLog() {

        BookLog bookLog1 = BookLogFactory.getBookLog(12345);
        BookLog bookLog2 = BookLogFactory.getBookLog(12345);

        System.out.println(bookLog1.toString());
        System.out.println(bookLog2.toString());

//        IF OBJECTS ARE NULL
        Assert.assertNotNull(bookLog1);
        Assert.assertNotNull(bookLog2);
        System.out.println("Objects are NOT null");

//        IF OBJECTS ARE DIFFERENT
        Assert.assertNotEquals(bookLog1, bookLog2);
        System.out.println("Objects are different");

//        IF OBJECTS ARE EQUAL
//        Assert.assertEquals(bookLog1,bookLog2);
//        System.out.println("Objects are the same");
    }
}