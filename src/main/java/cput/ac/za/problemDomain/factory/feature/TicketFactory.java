package cput.ac.za.problemDomain.factory.feature;

import cput.ac.za.problemDomain.domain.feature.Ticket;
import cput.ac.za.problemDomain.util.GenID;

import java.util.Date;

public class TicketFactory {

    public static Ticket getTicket(String violation, float date)
    {
        return new Ticket.Builder()
                .ticketNumber(GenID.generateId())
                .violation(violation)
                .date(date)
                .build();
    }


}
