package cput.ac.za.problemDomain.domain;


public class Taxi extends Vehicle {

    //  Default constructor
    public Taxi(String category) {
        super(category);
    }

    public Taxi(String plateNumber, String category, Driver owner, String colour, String manufacturer) {
        super(plateNumber, category, owner, colour, manufacturer);
    }




    public void showVehicle()
    {
        System.out.println("This is a TAXI");
    }


}