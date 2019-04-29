package cput.ac.za.problemDomain.factory;

import cput.ac.za.problemDomain.domain.Ticket;
import cput.ac.za.problemDomain.util.GenID;

import java.util.Date;

public class TicketFactory {

    public static Ticket getTicket(String violation, Date date)
    {
        return new Ticket.Builder()
                .ticketNumber(GenID.generateId())
                .violation(violation)
                .date(date)
                .build();
    }


}
