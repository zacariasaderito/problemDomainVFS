package cput.ac.za.problemDomain.domain.transport;


import cput.ac.za.problemDomain.domain.person.Driver;

public class HeavyDutyVehicle extends Vehicle {

    //  Default constructor


    public HeavyDutyVehicle(String category) {
        super(category);
    }

    public HeavyDutyVehicle(String plateNumber, String category, Driver owner, String colour, String manufacturer) {
        super(plateNumber, category, owner, colour, manufacturer);
    }

    public void showVehicle()
    {
        System.out.println("This is a HEAVY DUTY VEHICLE");
    }


}