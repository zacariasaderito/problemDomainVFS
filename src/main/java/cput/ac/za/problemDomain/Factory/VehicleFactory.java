package cput.ac.za.problemDomain.Factory;

import cput.ac.za.problemDomain.Build;
import cput.ac.za.problemDomain.Domain.Driver;
import cput.ac.za.problemDomain.Domain.Vehicle;

public class VehicleFactory {

    public static Vehicle getVehicle(String category, Driver owner, String colour, String manufacturer) {
        return new Vehicle.Builder().plateNumber(Build.generateId().toString())
                .category(category)
                .owner(owner)
                .colour(colour)
                .manufacturer(manufacturer)
                .build();
    }
}

