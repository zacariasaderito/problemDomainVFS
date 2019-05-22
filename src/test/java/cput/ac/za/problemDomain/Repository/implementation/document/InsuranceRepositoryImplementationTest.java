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

import java.util.Set;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class InsuranceRepositoryImplementationTest {

    @Autowired
    private InsuranceRepository repository;
    private Insurance insurance;
    private String id;


    @Before
    public void setUp() throws Exception {
        this.repository = InsuranceRepositoryImplementation.getRepository();
        this.insurance = InsuranceFactory.getInsurance(200, "Not Payed", true, 121212);
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void create() {
        Insurance result = repository.create(this.insurance);
        id = result.getInsuranceNumber();
//        Assert.assertNotNull(insurance);
        Assert.assertNotEquals(result, insurance);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }
}