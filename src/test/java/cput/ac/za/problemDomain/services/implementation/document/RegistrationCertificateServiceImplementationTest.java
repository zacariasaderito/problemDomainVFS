package cput.ac.za.problemDomain.services.implementation.document;

import cput.ac.za.problemDomain.Repository.Interfaces.document.RegistrationCertificateRepository;
import cput.ac.za.problemDomain.Repository.implementation.document.RegistrationCertificateRepositoryImplementation;
import cput.ac.za.problemDomain.domain.document.RegistrationCertificate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class RegistrationCertificateServiceImplementationTest {


    private RegistrationCertificateRepository repository;
    private RegistrationCertificate registrationCertificate;
    private Map<String, RegistrationCertificate> insurances;

    @Before
    public void setUp() throws Exception {
        this.repository = RegistrationCertificateRepositoryImplementation.getRepository();
//        this.insurance = RegistrationCertificateFactory.getInsurance(200, "Not Payed", );
    }

    private RegistrationCertificate getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Test
    public void getRepository() {
        this.repository.getAll().iterator().next();
    }

    @Test
    public void create() throws Exception {
        RegistrationCertificate created = this.repository.create(this.registrationCertificate);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.registrationCertificate);

    }

    @Test
    public void update() {
        String newInsuranceDescription = "Payed";
//        RegistrationCertificate updated = RegistrationCertificateFactory.getInsurance(400, "Payed", false, 212121);
//        System.out.println("In update, updated = " + updated);
//        this.repository.update(updated);
//        Assert.assertSame(newInsuranceDescription, updated.getRegistrationNumber());
    }

    @Test
    public void delete() {
        RegistrationCertificate saved = getSaved();
        this.repository.delete(saved.getRegistrationNumber());
        getAll();

    }

    @Test
    public void read() {
//        RegistrationCertificate saved = RegistrationCertificateFactory.getInsurance(400, "Payed", false, 212121);
//        RegistrationCertificate read = this.repository.read(saved.getRegistrationNumber());
//        System.out.println("In read, read = "+ read);
//        Assert.assertSame(read, saved);

    }

    @Test
    public void getAll() {
        Set<RegistrationCertificate> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}