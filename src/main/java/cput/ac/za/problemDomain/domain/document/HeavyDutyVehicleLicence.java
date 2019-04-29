package cput.ac.za.problemDomain.domain.document;

public class HeavyDutyVehicleLicence extends Licence {

    //  Default constructor
    public HeavyDutyVehicleLicence(String type) {
        super(type);

    }

    public void showLicence()
    {
        System.out.println("Licence for HEAVY DUTY VEHICLE");
    }

}
