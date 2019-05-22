package cput.ac.za.problemDomain.services.implementation.feature;

import cput.ac.za.problemDomain.Repository.Interfaces.feature.TrialRepository;
import cput.ac.za.problemDomain.Repository.implementation.feature.TrialRepositoryEmplementation;
import cput.ac.za.problemDomain.domain.feature.Trial;
import cput.ac.za.problemDomain.factory.feature.TrialFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class TrialServiceImplementationTest {

    private TrialRepository repository;
    private Trial trial;
    private Map<String, Trial> insurances;

    @Before
    public void setUp() throws Exception {
        this.repository = TrialRepositoryEmplementation.getRepository();
        this.trial = TrialFactory.getTrial("Limit break");
    }

    private Trial getSaved(){
        return this.repository.getAll().iterator().next();
    }


    @Test
    public void create() throws Exception {
        Trial created = this.repository.create(this.trial);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.trial);
    }

    @Test
    public void update() {
        String newTicketNUmber = "Payed";
        Trial updated = TrialFactory.getTrial("Payed");
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newTicketNUmber, updated.getVeredict());
    }

    @Test
    public void delete() {
        Trial saved = getSaved();
        this.repository.delete(saved.getRequestNumber());
        getAll();

    }

    @Test
    public void read() {
        Trial saved = TrialFactory.getTrial("Limit break");
        Trial read = this.repository.read(saved.getRequestNumber());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);

    }

    @Test
    public void getAll() {
        Set<Trial> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}