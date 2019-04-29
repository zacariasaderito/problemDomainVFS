package cput.ac.za.problemDomain.domain.document;

public class MotobikeLicense extends Licence {

    //  Default constructor
    public MotobikeLicense(String type) {
        super(type);
    }

    public void showLicence()
    {
        System.out.println("Licence for MOTOBIKE");
    }


}
