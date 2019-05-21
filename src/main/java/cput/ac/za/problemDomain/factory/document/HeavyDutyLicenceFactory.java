package cput.ac.za.problemDomain.factory.document;

import cput.ac.za.problemDomain.domain.document.HeavyDutyLicence;
import cput.ac.za.problemDomain.util.GenID;

public class HeavyDutyLicenceFactory {

    public static HeavyDutyLicence getInsurance(String type)
    {
        return new HeavyDutyLicence.Builder()
                .licenceNumber(GenID.generateId())
                .type(type)
                .build();
    }
}
