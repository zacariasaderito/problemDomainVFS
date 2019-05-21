package cput.ac.za.problemDomain.domain.document;

public class CarLicence implements Licence {

    private String licenceNumber;
    private String type;


    private CarLicence(Builder builder)
    {
        this.licenceNumber = builder.licenceNumber;
        this.type = builder.type;
    }

    public static class Builder
    {
        private String licenceNumber;
        private String type;

        public Builder licenceNumber(String licenceNumber)
        {
            this.licenceNumber = licenceNumber;
            return this;
        }

        public Builder type(String type)
        {
            this.type = type;
            return this;
        }

        public CarLicence build()
        {
            return new CarLicence(this);
        }

    }


    public String getLicenseNumber() {
        return licenceNumber;
    }

    public String getType() {
        return type;
    }

    public void showLicence()
    {
        System.out.println("Licence for CAR");
    }

    @Override
    public String toString() {
        return "CarLicence{" +
                "licenceNumber='" + licenceNumber + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
