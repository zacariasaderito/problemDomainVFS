package cput.ac.za.problemDomain.factory.feature;

import cput.ac.za.problemDomain.domain.person.Driver;
import cput.ac.za.problemDomain.domain.feature.Warrant;
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
