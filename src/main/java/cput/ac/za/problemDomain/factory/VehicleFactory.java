package cput.ac.za.problemDomain.factory;

import cput.ac.za.problemDomain.domain.*;

public class VehicleFactory {

    public static Vehicle createVehicle(String category) {

        Vehicle vehicle = null;

        if(category.equals("car"))
            vehicle = new Car("CAR");
        else if (category.equals("taxi"))
            vehicle = new Taxi("TAXI");
        else if (category.equals("heavy"))
            vehicle = new HeavyDutyVehicle("HEAVY DUTY");
        else if (category.equals("moto"))
            vehicle = new Motobike("MOTOBIKE");


        return vehicle;

    }
}


