//package cput.ac.za.problemDomain.Repository.implementation.feature;
//
//import cput.ac.za.problemDomain.Repository.Interfaces.feature.TicketRepository;
//import cput.ac.za.problemDomain.domain.feature.Ticket;
//
//import java.util.*;
//
//public class TicketRepositoryImplementation implements TicketRepository {
//
//    private static TicketRepositoryImplementation repository = null;
//    private Map<String, Ticket> tickets;
//
//    private TicketRepositoryImplementation()
//    {
//        this.tickets = new HashMap<>();
//    }
//
//
//    public static TicketRepository getRepository()
//    {
//        if (repository == null)
//            repository = new TicketRepositoryImplementation();
//
//        return repository;
//    }
//
//
//    @Override
//    public Ticket create(Ticket ticket) {
//        this.tickets.put(ticket.getTicketNumber(), ticket);
//        return ticket;
//    }
//
//    @Override
//    public Ticket update(Ticket ticket) {
//        this.tickets.replace(ticket.getTicketNumber(), ticket);
//        return this.tickets.get(ticket.getTicketNumber());
//    }
//
//    @Override
//    public void delete(String ticketNumber) {
//        this.tickets.remove(ticketNumber);
//    }
//
//    @Override
//    public Ticket read(String ticketNumber) {
//        return this.tickets.get(ticketNumber);
//    }
//
//    @Override
//    public Set<Ticket> getAll() {
//        Collection<Ticket> tickets = this.tickets.values();
//        HashSet<Ticket> set = new HashSet<>();
//        set.addAll(tickets);
//        return set;
//    }
//
//
//}
