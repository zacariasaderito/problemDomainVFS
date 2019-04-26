package cput.ac.za.problemDomain.Domain;

import cput.ac.za.problemDomain.Factory.LicenseFactory;


public class Driver {

    private int id;
    private String name;
    private int age;
    private String address;
    private int phoneNumber;
    private Licence licence;

    public Licence getLicence(String type)
    {
        licence = LicenseFactory.createLicense(type);
        return licence;
    }

    public void commitViolence()
    {

    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", licence=" + licence +
                '}';
    }

}
