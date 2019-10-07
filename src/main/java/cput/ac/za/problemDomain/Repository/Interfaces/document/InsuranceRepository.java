package cput.ac.za.problemDomain.Repository.Interfaces.document;


//import cput.ac.za.problemDomain.Repository.Interfaces.GeneralRepository;
import cput.ac.za.problemDomain.domain.document.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository <Insurance, String> {

}
