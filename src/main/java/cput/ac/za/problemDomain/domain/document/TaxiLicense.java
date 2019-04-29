package cput.ac.za.problemDomain.domain.document;


public class TaxiLicense extends Licence {

    //  Default constructor
    public TaxiLicense(String type) {
        super(type);
    }

    public void showLicence()
    {
        System.out.println("Licence for TAXI");
    }


}
