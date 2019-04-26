package cput.ac.za.problemDomain.Domain;


public class Car extends Vehicle{


    //  Default constructor


    public Car(String category) {
        super(category);
    }

    public Car(String plateNumber, String category, Driver owner, String colour, String manufacturer) {
        super(plateNumber, category, owner, colour, manufacturer);
    }

    public void showVehicle()
    {
        System.out.println("This is a CAR");
    }


}