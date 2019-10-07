package cput.ac.za.problemDomain.services.interfaces.document;

import cput.ac.za.problemDomain.domain.document.Insurance;
import cput.ac.za.problemDomain.services.interfaces.GeneralService;

public interface InsuranceService extends GeneralService<Insurance, String>{

    Insurance retrieveByDescription(String description);
}
