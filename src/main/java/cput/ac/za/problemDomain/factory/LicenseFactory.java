package cput.ac.za.problemDomain.factory;

import cput.ac.za.problemDomain.domain.*;

public class LicenseFactory {

    public static Licence createLicense(String type)
    {
        Licence licence = null;


        if(type.equals("car"))
            licence = new CarLicense("CAR");
        else if (type.equals("taxi"))
            licence = new TaxiLicense("TAXI");
        else if (type.equals("heavy"))
            licence = new HeavyDutyVehicleLicence("HEAVY DUTY");
        else if (type.equals("moto"))
            licence = new MotobikeLicense("MOTOBIKE");

        return licence;

    }

}
