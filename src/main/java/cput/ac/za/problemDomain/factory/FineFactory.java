package cput.ac.za.problemDomain.factory;

import cput.ac.za.problemDomain.domain.feature.Fine;
import cput.ac.za.problemDomain.util.GenID;

import java.util.Date;

public class FineFactory {

    public static Fine getFine(String status, Date dueDate, double price)
    {
        return new Fine.Builder()
                .fineNumber(GenID.generateId())
                .status(status)
                .dueDate(dueDate)
                .price(price)
                .build();
    }
}
