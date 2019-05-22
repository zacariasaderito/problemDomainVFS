package cput.ac.za.problemDomain.services.implementation.feature;

import cput.ac.za.problemDomain.Repository.Interfaces.feature.BookLogRepository;
import cput.ac.za.problemDomain.Repository.implementation.feature.BookLogRepositoryImplementation;
import cput.ac.za.problemDomain.domain.feature.BookLog;
import cput.ac.za.problemDomain.factory.feature.BookLogFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class BookLogServiceImplementationTest {

    private BookLogRepository repository;
    private BookLog bookLog;
    private Map<String, BookLog> insurances;

    @Before
    public void setUp() throws Exception {
        this.repository = BookLogRepositoryImplementation.getRepository();
        this.bookLog = BookLogFactory.getBookLog(12);
    }

    private BookLog getSaved(){
        return this.repository.getAll().iterator().next();
    }


    @Test
    public void create() throws Exception {
        BookLog created = this.repository.create(this.bookLog);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.bookLog);
    }

    @Test
    public void update() {
        int newNumberOfLog = 0;
        BookLog updated = BookLogFactory.getBookLog(400);
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newNumberOfLog, updated.getNumberOfLog());
    }

    @Test
    public void delete() {
        BookLog saved = getSaved();
        this.repository.delete(saved.getLogNumber());
        getAll();

    }

    @Test
    public void read() {
        BookLog saved = BookLogFactory.getBookLog(400);
        BookLog read = this.repository.read(saved.getLogNumber());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);

    }

    @Test
    public void getAll() {
        Set<BookLog> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}