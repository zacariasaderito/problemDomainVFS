package cput.ac.za.problemDomain.factory.document;

import cput.ac.za.problemDomain.domain.document.Insurance;
import cput.ac.za.problemDomain.util.GenID;

import java.util.Date;

public class InsuranceFactory {

    public static Insurance getInsurance(double price, String description, boolean status, float expiryDate)
    {
        return new Insurance.Builder()
                .insuranceNumber(GenID.generateId())
                .price(price)
                .description(description)
                .status(status)
                .expiryDate(expiryDate)
                .build();
    }

}

