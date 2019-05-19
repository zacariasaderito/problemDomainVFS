package cput.ac.za.problemDomain.services.implementation.document;

import cput.ac.za.problemDomain.Repository.Interfaces.document.InsuranceRepository;
import cput.ac.za.problemDomain.Repository.implementation.document.InsuranceRepositoryImplementation;
import cput.ac.za.problemDomain.domain.document.Insurance;
import cput.ac.za.problemDomain.services.interfaces.document.InsuranceService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class InsuranceServiceImplementation implements InsuranceService {

    //    @Autowired
    //    @Qualifier("InMemory")
    private InsuranceRepository repository;
    private static InsuranceServiceImplementation service = null;

    private InsuranceServiceImplementation() {
        this.repository = InsuranceRepositoryImplementation.getRepository();
    }

    public static InsuranceServiceImplementation getService() {
        if (service == null)
            service = new InsuranceServiceImplementation();

        return service;
    }

    @Override
    public Insurance create(Insurance insurance) {
        return repository.create(insurance);
    }

    @Override
    public Insurance update(Insurance insurance) {
        return repository.update(insurance);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Insurance read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Insurance> getAll() {
        return repository.getAll();
    }

}
