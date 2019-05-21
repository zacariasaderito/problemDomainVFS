package cput.ac.za.problemDomain.factory.feature;

import cput.ac.za.problemDomain.domain.feature.Ticket;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicketFactoryTest {

    @Test
    public void getTicket() {

        Ticket ticket1 = TicketFactory.getTicket("Velocity Limit Break", 12345);
        Ticket ticket2 = TicketFactory.getTicket("Velocity Limit Break", 12345);

        System.out.println(ticket1.toString());
        System.out.println(ticket2.toString());

        //        IF OBJECTS ARE NULL
        Assert.assertNotNull(ticket1);
        Assert.assertNotNull(ticket2);
        System.out.println("Objects are NOT null");

//       IF OBJECTS ARE DIFFERENT
        Assert.assertNotEquals(ticket1, ticket2);
        System.out.println("Objects are different");

//        IF OBJECTS ARE EQUAL
//        Assert.assertEquals(ticket1, ticket2);
//        System.out.println("Objects are the same");

    }
}