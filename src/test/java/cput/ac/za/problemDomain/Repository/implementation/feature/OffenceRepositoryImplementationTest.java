//package cput.ac.za.problemDomain.Repository.implementation.feature;
//
//import cput.ac.za.problemDomain.Repository.Interfaces.feature.OffenceRepository;
//import cput.ac.za.problemDomain.domain.feature.Offence;
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
//public class OffenceRepositoryImplementationTest {
//
//    private OffenceRepository repository;
//    private Offence offence;
//    private Map<String, Offence> offenceMap;
//
//    @Before
//    public void setUp() throws Exception {
//        this.repository = OffenceRepositoryImplementation.getRepository();
////        this.offence = OffenceFactory.getOfficer("Jaco", "Panico");
//    }
//
////    private Insurance getSaved(){
////        return this.repository.getAll().iterator().next();
////    }
////
////    @Test
////    public void getRepository() {
////        this.repository.getAll().iterator().next();
////    }
////
////    @Test
////    public void create() throws Exception {
////        Insurance created = this.repository.create(this.insurance);
////        System.out.println("In create, created = " + created);
////        Assert.assertNotNull(created);
////        Assert.assertSame(created, this.insurance);
////
////    }
////
////    @Test
////    public void update() {
////        String newInsuranceDescription = "Payed";
////        Insurance updated = InsuranceFactory.getInsurance(400, "Payed", false, 212121);
////        System.out.println("In update, updated = " + updated);
////        this.repository.update(updated);
////        Assert.assertSame(newInsuranceDescription, updated.getDescription());
////    }
////
////    @Test
////    public void delete() {
////        Insurance saved = getSaved();
////        this.repository.delete(saved.getInsuranceNumber());
////        getAll();
////
////    }
////
////    @Test
////    public void read() {
////        Insurance saved = InsuranceFactory.getInsurance(400, "Payed", false, 212121);
////        Insurance read = this.repository.read(saved.getInsuranceNumber());
////        System.out.println("In read, read = "+ read);
////        Assert.assertSame(read, saved);
////
////    }
////
////    @Test
////    public void getAll() {
////        Set<Insurance> all = this.repository.getAll();
////        System.out.println("In getAll, all = " + all);
////    }
//}