package cput.ac.za.problemDomain.Factory;

import cput.ac.za.problemDomain.Domain.*;

public class LicenseFactory {

    public static Licence createLicense(String type)
    {
        Licence licence = null;


        if(type.equals("car"))
            licence = new CarLicense(123456, "CAR");
        else if (type.equals("taxi"))
            licence = new TaxiLicense(234567, "TAXI");
        else if (type.equals("heavy"))
            licence = new HeavyDutyVehicleLicence(345678, "HEAVY DUTE");
        else if (type.equals("moto"))
            licence = new MotobikeLicense(012345, "MOTOBIKE");

        return licence;

    }

}
