package cput.ac.za.problemDomain.factory.document;

import cput.ac.za.problemDomain.domain.document.MotorbikeLicence;
import cput.ac.za.problemDomain.util.GenID;

public class MotorBikeLicenceFactory {

    public static MotorbikeLicence getInsurance(String type)
    {
        return new MotorbikeLicence.Builder()
                .licenceNumber(GenID.generateId())
                .type(type)
                .build();
    }
}
