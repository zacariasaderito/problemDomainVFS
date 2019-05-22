package cput.ac.za.problemDomain.Repository.implementation.document;

import cput.ac.za.problemDomain.Repository.Interfaces.document.InsuranceRepository;
import cput.ac.za.problemDomain.domain.document.Insurance;
import cput.ac.za.problemDomain.factory.document.InsuranceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.JVM)
public class InsuranceRepositoryImplementationTest {
//    @Autowired
    private InsuranceRepository repository;
    private Insurance insurance;
    private Map<String, Insurance> insurances;

    @Before
    public void setUp() throws Exception {
        this.repository = InsuranceRepositoryImplementation.getRepository();
        this.insurance = InsuranceFactory.getInsurance(200, "Not Payed", true, 121212);
    }

    private Insurance getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Test
    public void getRepository() {
        this.repository.getAll().iterator().next();
    }

    @Test
    public void create() throws Exception {
        Insurance created = this.repository.create(this.insurance);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.insurance);

//        this.insurances.put(insurance.getInsuranceNumber(), insurance);
//        Assert.assertSame(created, this.insurances.get(created.getInsuranceNumber()));
//        Assert.assertNotNull(insurance);
//        Assert.assertNotEquals(result, insurance);
    }

    @Test
    public void update() {
        String newInsuranceDescription = "Payed";
        Insurance updated = InsuranceFactory.getInsurance(400, "Payed", false, 212121);
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newInsuranceDescription, updated.getDescription());
    }

    @Test
    public void delete() {
        Insurance saved = getSaved();
        this.repository.delete(saved.getInsuranceNumber());
        getAll();

    }

    @Test
    public void read() {
        Insurance saved = InsuranceFactory.getInsurance(400, "Payed", false, 212121);
        Insurance read = this.repository.read(saved.getInsuranceNumber());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);

    }

    @Test
    public void getAll() {
        Set<Insurance> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}