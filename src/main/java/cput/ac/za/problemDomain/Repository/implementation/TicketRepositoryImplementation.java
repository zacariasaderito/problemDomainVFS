package cput.ac.za.problemDomain.Repository.implementation;

import cput.ac.za.problemDomain.Repository.TicketRepository;
import cput.ac.za.problemDomain.domain.feature.Ticket;

import java.util.HashSet;
import java.util.Set;

public class TicketRepositoryImplementation implements TicketRepository {

    private static TicketRepositoryImplementation repository = null;
    private Set<Ticket> tickets;

    private TicketRepositoryImplementation()
    {
        this.tickets = new HashSet<>();
    }


    public static TicketRepository getRepository()
    {
        if (repository == null)
            repository = new TicketRepositoryImplementation();

        return repository;
    }


    @Override
    public Ticket create(Ticket ticket) {
        this.tickets.add(ticket);
        return ticket;
    }

    @Override
    public Ticket update(Ticket t) {
        return null;
    }

    @Override
    public void delete(String ticketNumber) {

    }

    @Override
    public Ticket read(String ticketNumber) {
        return null;
    }


    public Set<Ticket> getAll()
    {
        return this.tickets;
    }


}
