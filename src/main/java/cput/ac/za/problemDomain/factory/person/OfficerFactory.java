package cput.ac.za.problemDomain.factory.person;

import cput.ac.za.problemDomain.domain.person.Officer;
import cput.ac.za.problemDomain.util.GenID;

public class OfficerFactory {

    public static Officer getOfficer(String name, String post)
    {
        return new Officer.Builder()
                .officerID(GenID.generateId())
                .name(name)
                .post(post)
                .build();
    }

}
