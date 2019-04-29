package cput.ac.za.problemDomain.util;

import java.util.UUID;

public class GenID {

    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}
