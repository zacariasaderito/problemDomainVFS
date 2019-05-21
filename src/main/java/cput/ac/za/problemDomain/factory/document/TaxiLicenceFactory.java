package cput.ac.za.problemDomain.factory.document;

import cput.ac.za.problemDomain.domain.document.TaxiLicense;
import cput.ac.za.problemDomain.util.GenID;

public class TaxiLicenceFactory {

    public static TaxiLicense getInsurance( String type)
    {
        return new TaxiLicense.Builder()
                .licenceNumber(GenID.generateId())
                .type(type)
                .build();
    }


}
