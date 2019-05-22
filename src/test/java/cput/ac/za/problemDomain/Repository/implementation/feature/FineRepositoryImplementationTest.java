package cput.ac.za.problemDomain.Repository.implementation.feature;

import cput.ac.za.problemDomain.Repository.Interfaces.feature.FineRepository;
import cput.ac.za.problemDomain.domain.feature.Fine;
import cput.ac.za.problemDomain.factory.feature.BookLogFactory;
import cput.ac.za.problemDomain.factory.feature.FineFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class FineRepositoryImplementationTest {

    private FineRepository repository;
    private Fine fine;
    private Map<String, Fine> insurances;

    @Before
    public void setUp() throws Exception {
        this.repository = FineRepositoryImplementation.getRepository();
        this.fine = FineFactory.getFine("paid", 12345, 400);
    }

    private Fine getSaved(){
        return this.repository.getAll().iterator().next();
    }


    @Test
    public void create() throws Exception {
        Fine created = this.repository.create(this.fine);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.fine);
    }

    @Test
    public void update() {
        String newFineNumber = "payed";
            Fine updated = FineFactory.getFine("payed", 12345, 400);
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newFineNumber, updated.getStatus());
    }

    @Test
    public void delete() {
        Fine saved = getSaved();
        this.repository.delete(saved.getFineNumber());
        getAll();

    }

    @Test
    public void read() {
        Fine saved = FineFactory.getFine("payed", 12345, 400);
        Fine read = this.repository.read(saved.getFineNumber());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);

    }

    @Test
    public void getAll() {
        Set<Fine> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}