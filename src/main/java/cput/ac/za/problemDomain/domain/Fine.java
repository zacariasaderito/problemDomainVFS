package cput.ac.za.problemDomain.domain;

import java.util.*;


public class Fine {

    private String fineNumber;
    private String status;
    private Date dueDate;
    private double price;

    //  Default constructor
    public Fine() {
    }

    private Fine(Builder builder)
    {
        this.fineNumber = builder.fineNumber;
        this.status = builder.status;
        this.dueDate = builder.dueDate;
        this.price = builder.price;
    }

    // Getters
    public String getFineNumber() {
        return fineNumber;
    }

    public String getStatus() {
        return status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public double getPrice() {
        return price;
    }

//    Builder
    public static class Builder
    {
        private String fineNumber;
        private String status;
        private Date dueDate;
        private double price;


        public Builder fineNumber(String fineNumber)
        {
            this.fineNumber = fineNumber;
            return this;
        }

        public Builder status(String status)
        {
            this.status = status;
            return this;
        }

        public Builder dueDate(Date dueDate)
        {
            this.dueDate = dueDate;
            return this;
        }

        public Builder price(double price)
        {
            this.price = price;
            return this;
        }

        public Fine build()
        {
            return new Fine(this);
        }

    }


}