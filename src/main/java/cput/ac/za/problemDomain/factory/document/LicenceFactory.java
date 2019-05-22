package cput.ac.za.problemDomain.factory.document;

import cput.ac.za.problemDomain.domain.document.*;
import cput.ac.za.problemDomain.domain.document.HeavyDutyLicence;

public class LicenceFactory {

    public static Licence createLicense(String type)
    {
        Licence licence = null;

        switch (type) {
            case "car":
                licence = CarLicenceFactory.getInsurance(type);
                break;
            case "taxi":
                licence = TaxiLicenceFactory.getInsurance(type);
                break;
            case "heavy":
                licence = HeavyDutyLicenceFactory.getInsurance(type);
                break;
            case "moto":
                licence = MotorBikeLicenceFactory.getInsurance(type);
                break;
        }

        return licence;
    }

}
