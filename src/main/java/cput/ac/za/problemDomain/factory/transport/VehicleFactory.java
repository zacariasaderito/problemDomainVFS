package cput.ac.za.problemDomain.factory.transport;

import cput.ac.za.problemDomain.domain.person.Driver;
import cput.ac.za.problemDomain.domain.transport.*;
import cput.ac.za.problemDomain.util.GenID;

public class VehicleFactory {

    public static Vehicle createVehicle(String category, Driver owner, String colour, String manufacture) {

        Vehicle vehicle = null;

        switch (category) {
            case "car":
                vehicle = CarFactory.getInsurance(category, owner, colour, manufacture);
                break;
            case "taxi":
                vehicle = TaxiFactory.getInsurance(category, owner, colour, manufacture);
                break;
            case "heavy":
                vehicle = HeavyDutyVehicleFactory.getInsurance(category, owner, colour, manufacture);
                break;
            case "moto":
                vehicle = MotorBikeFactory.getInsurance(category, owner, colour, manufacture);
                break;
        }

        return vehicle;

    }



}


