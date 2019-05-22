package cput.ac.za.problemDomain.factory.transport;

import cput.ac.za.problemDomain.domain.person.Driver;
import cput.ac.za.problemDomain.domain.transport.Taxi;
import cput.ac.za.problemDomain.util.GenID;

public class TaxiFactory {

    public static Taxi getInsurance(String category, Driver owner, String colour, String manufacturer)
    {
        return new Taxi.Builder()
                .getPlateNumber(GenID.generateId())
                .getCategory(category)
                .getOwner(owner)
                .getColour(colour)
                .getManufacturer(manufacturer)
                .build();
    }

}
