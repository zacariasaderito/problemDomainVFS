package cput.ac.za.problemDomain.domain.document;

import java.util.Random;

public abstract class Licence {


    private int licenseNumber;
    private String type;

    private int getLicenseNumber()
    {
        Random random = new Random();

        licenseNumber = random.nextInt(89999) + 10000;

        return licenseNumber;
    }


    //  Default constructor
    public Licence(String type) {
        licenseNumber = getLicenseNumber();
        this.type = type;
    }

    public void showLicence()
    {
    }

    @Override
    public String toString() {
        return "Licence{" +
                "licenseNumber=" + licenseNumber +
                ", type='" + type + '\'' +
                '}';
    }
}
