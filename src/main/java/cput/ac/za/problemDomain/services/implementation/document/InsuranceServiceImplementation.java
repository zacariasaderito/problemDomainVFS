package cput.ac.za.problemDomain.services.implementation.document;

import cput.ac.za.problemDomain.Repository.Interfaces.document.InsuranceRepository;
import cput.ac.za.problemDomain.domain.document.Insurance;
import cput.ac.za.problemDomain.services.interfaces.document.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class InsuranceServiceImplementation implements InsuranceService {
    @Autowired
    private InsuranceRepository repository;
    private static InsuranceServiceImplementation service = null;

    private InsuranceServiceImplementation() {

    }

    public static InsuranceServiceImplementation getService() {
        if (service == null)
            service = new InsuranceServiceImplementation();

        return service;
    }

    @Override
    public Insurance create(Insurance insurance) {
        return repository.save(insurance);
    }

    @Override
    public Insurance update(Insurance insurance) {
        return repository.save(insurance);
    }

    @Override
    public void delete(String s) {
        repository.deleteById(s);
    }

    @Override
    public Insurance read(String s) {
        Optional<Insurance> optionalInsurance = this.repository.findById(s);
        return optionalInsurance.orElse(null);
    }


    public Insurance retrieveByDescription(String InsuranceDescription) {
        List<Insurance> Insurances = getAll();
        for (Insurance Insurance : Insurances) {
            if (Insurance.getDescription().equalsIgnoreCase(InsuranceDescription)) return Insurance;
        }
        return null;
    }

    //@Override
    public List<Insurance> getAll() {
        return repository.findAll();
    }

}
