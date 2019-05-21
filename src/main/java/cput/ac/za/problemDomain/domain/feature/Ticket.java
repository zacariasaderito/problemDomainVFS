package cput.ac.za.problemDomain.domain.feature;

import java.util.*;


public class Ticket {

    private String ticketNumber;
    private String violation;
    private float date;


    //  Default constructor
    private Ticket() {
    }

    private Ticket(Builder builder)
    {
        this.ticketNumber = builder.ticketNumber;
        this.violation = builder.violation;
        this.date = builder.date;
    }


    public String getTicketNumber() {
        return ticketNumber;
    }

    public String getViolation() {
        return violation;
    }

    public float getDate() {
        return date;
    }


    public static class Builder
    {
        private String ticketNumber;
        private String violation;
        private float date;


        public Builder ticketNumber(String ticketNumber)
        {
            this.ticketNumber = ticketNumber;
            return this;
        }

        public Builder violation(String violation)
        {
            this.violation = violation;
            return this;
        }

        public Builder date(float date)
        {
            this.date = date;
            return this;
        }

        public Ticket build()
        {
            return new Ticket(this);
        }


    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber='" + ticketNumber + '\'' +
                ", violation='" + violation + '\'' +
                ", date=" + date +
                '}';
    }
}