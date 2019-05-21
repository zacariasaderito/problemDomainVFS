package cput.ac.za.problemDomain.factory.document;

import cput.ac.za.problemDomain.domain.document.CarLicence;
import cput.ac.za.problemDomain.util.GenID;

public class CarLicenceFactory {

    public static CarLicence getInsurance(String type)
    {
        return new CarLicence.Builder()
                .licenceNumber(GenID.generateId())
                .type(type)
                .build();
    }

}
