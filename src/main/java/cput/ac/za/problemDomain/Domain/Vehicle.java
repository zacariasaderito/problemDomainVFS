package cput.ac.za.problemDomain.Domain;

import cput.ac.za.problemDomain.Build;
import javafx.util.Builder;

import java.util.*;

/**
 * 
 */
public abstract class Vehicle {

    private int plateNumber;
    private String category;
    private Driver owner;
    private String colour;
    private String manufacturer;

    private Vehicle(int plateNumber, String category, Driver owner, String colour, String manufacturer) {
    }

    private Vehicle(Builder builder) {
        this.plateNumber = plateNumber;
        this.category = category;
        this.owner = owner;
        this.colour = colour;
        this.manufacturer = manufacturer;
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

    public static class Builder {
        private String plateNumber;
        private String category;
        private Driver owner;
        private String colour;
        private String manufacturer;

        public Builder plateNumber(String plateNumber){
            this.plateNumber = plateNumber;
            return this;
        }
        public Builder category(String category){
            this.category = category;
            return this;
        }
        public Builder owner(Driver owner){
            this.owner = owner;
            return this;
        }
        public Builder colour(String colour){
            this.colour = colour;
            return this;
        }

        public Builder manufacturer(String manufacturer){
            this.manufacturer = manufacturer;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this){};
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

}