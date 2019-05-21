package cput.ac.za.problemDomain.factory.person;

import cput.ac.za.problemDomain.domain.document.Licence;
import cput.ac.za.problemDomain.domain.person.Driver;
import cput.ac.za.problemDomain.util.GenID;

public class DriverFactory {

    public static Driver getDriver(String name, int age, String address, int phoneNumber, Licence licence) {

        return new Driver.Builder()
                .id(GenID.generateId())
                .name(name)
                .age(age)
                .address(address)
                .phoneNumber(phoneNumber)
                .licence(licence)
                .build();
    }

}
