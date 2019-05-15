package cput.ac.za.problemDomain.factory.feature;

import cput.ac.za.problemDomain.domain.feature.BookLog;
import cput.ac.za.problemDomain.util.GenID;

public class BookLogFactory {

    public static BookLog getBookLog(int numberOfLog)
    {
        return new BookLog.Builder()
                .logNumber(GenID.generateId())
                .numberOfLog(numberOfLog)
                .build();
    }
}
