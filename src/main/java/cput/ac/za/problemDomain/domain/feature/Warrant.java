package cput.ac.za.problemDomain.domain.feature;


import cput.ac.za.problemDomain.domain.person.Driver;

import java.util.Date;

public class Warrant {

    private String warrantNumber;
    private String description;
    private float issueDate;
    private Driver concernedDriver;

    //  Default constructor
    private Warrant(Builder builder) {

        this.warrantNumber = builder.warrantNumber;
        this.description = builder.description;
        this.issueDate = builder.issueDate;
        this.concernedDriver = builder.concernedDriver;

    }

//    Getters
    public String getWarrantNumber() {
        return warrantNumber;
    }

    public String getDescription() {
        return description;
    }

    public float getIssueDate() {
        return issueDate;
    }

    public Driver getConcernedDriver() {
        return concernedDriver;
    }


//       Builder
    public static class Builder {

        private String warrantNumber;
        private String description;
        private float issueDate;
        private Driver concernedDriver;

        public Builder warrantNumber(String warrantNumber)
        {
            this.warrantNumber = warrantNumber;
            return this;
        }

        public Builder description(String description)
        {
            this.description = description;
            return this;
        }

        public Builder issueDate(float issueDate)
        {
            this.issueDate = issueDate;
            return this;
        }

        public Builder concernedDriver(Driver concernedDriver)
        {
            this.concernedDriver = concernedDriver;
            return this;
        }

        public Warrant build()
        {
            return new Warrant(this);
        }
    }

    @Override
    public String toString() {
        return "Warrant{" +
                "warrantNumber='" + warrantNumber + '\'' +
                ", description='" + description + '\'' +
                ", issueDate=" + issueDate +
                ", concernedDriver=" + concernedDriver +
                '}';
    }
}