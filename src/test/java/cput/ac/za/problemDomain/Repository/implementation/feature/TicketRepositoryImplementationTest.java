package cput.ac.za.problemDomain.Repository.implementation.feature;

import cput.ac.za.problemDomain.Repository.Interfaces.feature.TicketRepository;
import cput.ac.za.problemDomain.domain.feature.Ticket;
import cput.ac.za.problemDomain.factory.feature.TicketFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class TicketRepositoryImplementationTest {

    private TicketRepository repository;
    private Ticket trial;
    private Map<String, Ticket> insurances;

    @Before
    public void setUp() throws Exception {
        this.repository = TicketRepositoryImplementation.getRepository();
        this.trial = TicketFactory.getTicket("Limit break", 12345);
    }

    private Ticket getSaved(){
        return this.repository.getAll().iterator().next();
    }


    @Test
    public void create() throws Exception {
        Ticket created = this.repository.create(this.trial);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.trial);
    }

    @Test
    public void update() {
        String newViolation = "Limit break";
        Ticket updated = TicketFactory.getTicket("Limit break", 400);
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newViolation, updated.getViolation());
    }

    @Test
    public void delete() {
        Ticket saved = getSaved();
        this.repository.delete(saved.getTicketNumber());
        getAll();

    }

    @Test
    public void read() {
        Ticket saved = TicketFactory.getTicket("Limit break", 400);
        Ticket read = this.repository.read(saved.getTicketNumber());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);

    }

    @Test
    public void getAll() {
        Set<Ticket> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

}