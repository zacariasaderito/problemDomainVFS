package cput.ac.za.problemDomain.factory.document;

import cput.ac.za.problemDomain.domain.document.*;
import cput.ac.za.problemDomain.domain.document.HeavyDutyLicence;

public class LicenceFactory {

    public static Licence createLicense(String type)
    {
        Licence licence = null;

        if(type.equals("car"))
            licence = CarLicenceFactory.getInsurance(type);
       else if (type.equals("taxi"))
            licence = TaxiLicenceFactory.getInsurance(type);
        else if (type.equals("heavy"))
            licence = HeavyDutyLicenceFactory.getInsurance(type);
        else if (type.equals("moto"))
            licence = MotorBikeLicenceFactory.getInsurance(type);

        return licence;
    }

}
