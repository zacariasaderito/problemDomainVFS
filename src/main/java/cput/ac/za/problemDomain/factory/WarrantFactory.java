package cput.ac.za.problemDomain.factory;

import cput.ac.za.problemDomain.domain.Driver;
import cput.ac.za.problemDomain.domain.Warrant;
import cput.ac.za.problemDomain.util.GenID;

import java.util.Date;

public class WarrantFactory {

    public static Warrant getWarrant(String description, Date issueDate, Driver concernedDriver)
    {
        return new Warrant.Builder()
                .warrantNumber(GenID.generateId())
                .description(description)
                .issueDate(issueDate)
                .concernedDriver(concernedDriver)
                .build();
    }

}
