package cput.ac.za.problemDomain.domain;


public abstract class Vehicle {

    private int plateNumber;
    private String category;
    private Driver owner;
    private String colour;
    private String manufacturer;

    // Constructor
    public Vehicle(String category) {
        this.category = category;
    }

    public Vehicle(String plateNumber, String category, Driver owner, String colour, String manufacturer) {
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public String getCategory() {
        return category;
    }

    public Driver getOwner() {
        return owner;
    }

    public String getColour() {
        return colour;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setOwner(Driver owner) {
        this.owner = owner;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public void showVehicle()
    {
    }


        @Override
        public String toString() {
            return "Builder{" +
                    "plateNumber=" + plateNumber +
                    ", category='" + category + '\'' +
                    ", owner=" + owner +
                    ", colour='" + colour + '\'' +
                    ", manufacturer='" + manufacturer + '\'' +
                    '}';
        }

}