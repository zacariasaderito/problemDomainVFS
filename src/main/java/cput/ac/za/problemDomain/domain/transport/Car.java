package cput.ac.za.problemDomain.domain.transport;


import cput.ac.za.problemDomain.domain.person.Driver;

public class Car implements Vehicle{

    private String plateNumber;
    private String category;
    private Driver owner;
    private String colour;
    private String manufacturer;


    private Car(Builder builder)
    {
        this.plateNumber = builder.plateNumber;
        this.category = builder.category;
        this.owner = builder.owner;
        this.colour = builder.colour;
        this.manufacturer = builder.manufacturer;
    }

    public static class Builder
    {
        private String plateNumber;
        private String category;
        private Driver owner;
        private String colour;
        private String manufacturer;

        public Builder getPlateNumber(String plateNumber)
        {
            this.plateNumber = plateNumber;
            return this;
        }

        public Builder getCategory(String category)
        {
            this.category = category;
            return this;
        }

        public Builder getOwner(Driver owner)
        {
            this.owner = owner;
            return this;
        }

        public Builder getColour(String colour)
        {
            this.colour = colour;
            return this;
        }

        public Builder getManufacturer(String manufacturer)
        {
            this.manufacturer = manufacturer;
            return this;
        }

        public Car build()
        {
            return new Car(this);
        }

    }

//    GETTERS
    public String getPlateNumber() {
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

    @Override
    public void showVehicle()
    {
        System.out.println("This is a CAR");
    }

    @Override
    public String toString() {
        return "Car{" +
                "plateNumber='" + plateNumber + '\'' +
                ", category='" + category + '\'' +
                ", owner=" + owner +
                ", colour='" + colour + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}