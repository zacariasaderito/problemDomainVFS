//package cput.ac.za.problemDomain.Repository.implementation.person;
//
//import cput.ac.za.problemDomain.Repository.Interfaces.person.OfficerRepository;
//import cput.ac.za.problemDomain.domain.person.Officer;
//import cput.ac.za.problemDomain.factory.person.OfficerFactory;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.Map;
//import java.util.Set;
//
//import static org.junit.Assert.*;
//
//public class OfficerRepositoryImplementationTest {
//
//    private OfficerRepository repository;
//    private Officer officer;
//    private Map<String, Officer> insurances;
//
//    @Before
//    public void setUp() throws Exception {
//        this.repository = OfficerRepositoryImplementation.getRepository();
//        this.officer = OfficerFactory.getOfficer("Nando", "Traffic ");
//    }
//
//    private Officer getSaved(){
//        return this.repository.getAll().iterator().next();
//    }
//
//
//    @Test
//    public void create() throws Exception {
//        Officer created = this.repository.create(this.officer);
//        System.out.println("In create, created = " + created);
//        Assert.assertNotNull(created);
//        Assert.assertSame(created, this.officer);
//    }
//
//    @Test
//    public void update() {
//        String newName = "Nando";
//        Officer updated = OfficerFactory.getOfficer("Nando", "Traffic");
//        System.out.println("In update, updated = " + updated);
//        this.repository.update(updated);
//        Assert.assertSame(newName, updated.getName());
//    }
//
//    @Test
//    public void delete() {
//        Officer saved = getSaved();
//        this.repository.delete(saved.getOfficerID());
//        getAll();
//
//    }
//
//    @Test
//    public void read() {
//        Officer saved = OfficerFactory.getOfficer("Nando", "Traffic");
//        Officer read = this.repository.read(saved.getOfficerID());
//        System.out.println("In read, read = "+ read);
//        Assert.assertSame(read, saved);
//
//    }
//
//    @Test
//    public void getAll() {
//        Set<Officer> all = this.repository.getAll();
//        System.out.println("In getAll, all = " + all);
//    }
//
//}