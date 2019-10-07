package cput.ac.za.problemDomain.factory;

import cput.ac.za.problemDomain.ResponseObject;

public class ResponseObjectFactory {

    public static ResponseObject buildGenericResponseObject(String responseCode, String responseDescription) {
        return new ResponseObject(responseCode, responseDescription);
    }
}
