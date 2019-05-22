package cput.ac.za.problemDomain.services.implementation.document;

import cput.ac.za.problemDomain.Repository.Interfaces.document.LicenceRepository;
import cput.ac.za.problemDomain.Repository.implementation.document.LicenceRepositoryImplementation;
import cput.ac.za.problemDomain.domain.document.Licence;
import cput.ac.za.problemDomain.factory.document.LicenceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LicenceServiceImplementationTest {

    private LicenceRepository repository;
    private Licence licence;

    @Before
    public void setUp() throws Exception {
        this.repository = LicenceRepositoryImplementation.getRepository();
        this.licence = LicenceFactory.createLicense("car");
    }

    @Test
    public void getRepository() {


    }

    @Test
    public void create() {
        Licence created = this.repository.create(this.licence);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.licence);
    }

    @Test
    public void update() {
        String newLicence = "car";
        Licence updated = LicenceFactory.createLicense("car");
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newLicence, updated.getType());

    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }
}