//package cput.ac.za.problemDomain.services.implementation.document;
//
//import cput.ac.za.problemDomain.Repository.Interfaces.document.RoadTaxRepository;
//import cput.ac.za.problemDomain.domain.document.RoadTax;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.Map;
//import java.util.Set;
//
//import static org.junit.Assert.*;
//
//public class RoadTaxServiceImplementationTest {
//
//    private RoadTaxRepository repository;
//    private RoadTax roadTax;
//    private Map<String, RoadTax> insurances;
//
//    @Before
//    public void setUp() throws Exception {
////        this.repository = InsuranceRepositoryImplementation.getRepository();
////        this.roadTax = RoadTaxFactory.getInsurance(200, "Not Payed", true, 121212);
//    }
//
//    private RoadTax getSaved(){
//        return this.repository.getAll().iterator().next();
//    }
//
//    @Test
//    public void getRepository() {
//        this.repository.getAll().iterator().next();
//    }
//
//    @Test
//    public void create() throws Exception {
//        RoadTax created = this.repository.create(this.roadTax);
//        System.out.println("In create, created = " + created);
//        Assert.assertNotNull(created);
//        Assert.assertSame(created, this.roadTax);
//
//    }
//
//    @Test
//    public void update() {
//        String newInsuranceDescription = "Payed";
////        RoadTax updated = RoadTaxFactory.getInsurance(400, "Payed", false, 212121);
////        System.out.println("In update, updated = " + updated);
////        this.repository.update(updated);
////        Assert.assertSame(newInsuranceDescription, updated.getDescription());
//    }
//
//    @Test
//    public void delete() {
//        RoadTax saved = getSaved();
//        this.repository.delete(saved.getTaxNumber());
//        getAll();
//
//    }
//
//    @Test
//    public void read() {
////        RoadTax saved = RoadTaxFactory.getInsurance(400, "Payed", false, 212121);
////        RoadTax read = this.repository.read(saved.getInsuranceNumber());
////        System.out.println("In read, read = "+ read);
////        Assert.assertSame(read, saved);
//
//    }
//
//    @Test
//    public void getAll() {
//        Set<RoadTax> all = this.repository.getAll();
//        System.out.println("In getAll, all = " + all);
//    }
//}