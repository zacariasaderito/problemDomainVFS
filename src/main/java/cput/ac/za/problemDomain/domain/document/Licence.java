package cput.ac.za.problemDomain.domain.document;

import java.util.Random;

public abstract class Licence {


    private String licenseNumber;
    private String type;

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getType() {
        return type;
    }

    //  Default constructor
    public Licence(String type) {}

    public void showLicence() {}

    @Override
    public String toString() {
        return "Licence{" +
                "licenseNumber=" + licenseNumber +
                ", type='" + type + '\'' +
                '}';
    }
}
