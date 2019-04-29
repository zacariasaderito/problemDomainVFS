package cput.ac.za.problemDomain.domain;



public class BookLog {

    private String logNumber;
    private int numberOfLog;


    //  Default constructor
    private BookLog(Builder builder) {
        this.logNumber = builder.logNumber;
        this.numberOfLog = builder.numberOfLog;
    }

    public String getLogNumber() {
        return logNumber;
    }

    public int getNumberOfLog() {
        return numberOfLog;
    }

    public static class Builder {

        private String logNumber;
        private int numberOfLog;

        public Builder logNumber(String logNumber)
        {
            this.logNumber = logNumber;
            return this;
        }

        public Builder numberOfLog(int logNumber)
        {
            this.numberOfLog = numberOfLog;
            return this;
        }

        public BookLog build()
        {
            return new BookLog(this);
        }

    }

}