package cput.ac.za.problemDomain.factory.transport;

import cput.ac.za.problemDomain.domain.person.Driver;
import cput.ac.za.problemDomain.domain.transport.HeavyDutyVehicle;
import cput.ac.za.problemDomain.util.GenID;

public class HeavyDutyVehicleFactory {

    public static HeavyDutyVehicle getInsurance(String category, Driver owner, String colour, String manufacturer)
    {
        return new HeavyDutyVehicle.Builder()
                .getPlateNumber(GenID.generateId())
                .getCategory(category)
                .getOwner(owner)
                .getColour(colour)
                .getManufacturer(manufacturer)
                .build();
    }
}
