package cput.ac.za.problemDomain.factory;

import cput.ac.za.problemDomain.domain.Driver;
import cput.ac.za.problemDomain.util.GenID;

public class DriverFactory {

    public static Driver getDriver(String name, int age, String address, int phoneNumber, String type) {

        return new Driver.Builder()
                .id(GenID.generateId())
                .name(name)
                .age(age)
                .address(address)
                .phoneNumber(phoneNumber)
                .licence(LicenseFactory.createLicense(type))
                .build();
    }

}
