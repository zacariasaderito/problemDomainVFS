package cput.ac.za.problemDomain.factory.transport;

import cput.ac.za.problemDomain.domain.person.Driver;
import cput.ac.za.problemDomain.domain.transport.Motorbike;
import cput.ac.za.problemDomain.util.GenID;

public class MotorBikeFactory {

    public static Motorbike getInsurance(String category, Driver owner, String colour, String manufacturer)
    {
        return new Motorbike.Builder()
                .getPlateNumber(GenID.generateId())
                .getCategory(category)
                .getOwner(owner)
                .getColour(colour)
                .getManufacturer(manufacturer)
                .build();
    }
}
