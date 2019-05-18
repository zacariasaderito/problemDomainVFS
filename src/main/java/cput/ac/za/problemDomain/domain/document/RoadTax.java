package cput.ac.za.problemDomain.domain.document;

import java.util.*;


public class RoadTax {

    private String taxNumber;
    private String status;
    private Date expiryDate;

    //  Default constructor
    public RoadTax() {
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public String getStatus() {
        return status;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }
}