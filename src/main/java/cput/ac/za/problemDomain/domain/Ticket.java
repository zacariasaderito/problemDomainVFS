package cput.ac.za.problemDomain.domain;

import javafx.util.Builder;

import java.util.*;


public class Ticket {

    private int ticketNumber;
    private String violetion;
    private Date date;


    //  Default constructor
    private Ticket() {
    }

    private Ticket(Builder builder)
    {
        this.ticketNumber = builder.ticketNumber;
        this.violetion = builder.violation;
    }


}