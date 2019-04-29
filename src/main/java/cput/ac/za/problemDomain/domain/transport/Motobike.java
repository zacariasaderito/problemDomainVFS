package cput.ac.za.problemDomain.domain.transport;

import cput.ac.za.problemDomain.domain.person.Driver;

public class Motobike extends Vehicle {


    //  Default constructor


    public Motobike(String category) {
        super(category);
    }

    public Motobike(String plateNumber, String category, Driver owner, String colour, String manufacturer) {
        super(plateNumber, category, owner, colour, manufacturer);
    }

    public void showVehicle()
    {
        System.out.println("This is a MOTOBIKE");
    }

}