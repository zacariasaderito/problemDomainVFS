package cput.ac.za.problemDomain.factory.transport;

import cput.ac.za.problemDomain.domain.person.Driver;
import cput.ac.za.problemDomain.domain.transport.Car;
import cput.ac.za.problemDomain.util.GenID;

public class CarFactory {

    public static Car getInsurance(String category, Driver owner, String colour, String manufacturer)
    {
        return new Car.Builder()
                .getPlateNumber(GenID.generateId())
                .getCategory(category)
                .getOwner(owner)
                .getColour(colour)
                .getManufacturer(manufacturer)
                .build();
    }

}
