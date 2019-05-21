package cput.ac.za.problemDomain.domain.document;

public class Insurance {

    private String insuranceNumber;
    private double price;
    private String description;
    private boolean status;
    private float expiryDate;

    private Insurance(Builder builder)
    {
        this.insuranceNumber = builder.insuranceNumber;
        this.price = builder.price;
        this.description = builder.description;
        this.status = builder.status;
        this.expiryDate = builder.expiryDate;
    }

//  Builder
    public static class Builder
    {
        private String insuranceNumber;
        private double price;
        private String description;
        private boolean status;
        private float expiryDate;

        public Builder insuranceNumber(String insuranceNumber)
        {
            this.insuranceNumber = insuranceNumber;
            return this;
        }

        public Builder price(double price)
        {
            this.price = price;
            return this;
        }

        public Builder description(String description)
        {
            this.description = description;
            return this;
        }

        public Builder status(boolean status)
        {
            this.status = status;
            return this;
        }

        public Builder expiryDate(float expiryDate)
        {
            this.expiryDate = expiryDate;
            return this;
        }

        public Insurance build()
        {
            return new Insurance(this);
        }

    }


//  Getters
    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isStatus() {
        return status;
    }

    public Float getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceNumber='" + insuranceNumber + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", expiryDate=" + expiryDate +
                '}';
    }
}