package cput.ac.za.problemDomain.domain.document;

public class MotorbikeLicence implements Licence {

    private String licenceNumber;
    private String type;


    private MotorbikeLicence(Builder builder)
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

        public MotorbikeLicence build()
        {
            return new MotorbikeLicence(this);
        }

    }

    @Override
    public void showLicence() {
        System.out.println("Licence for MotorbikeLicence");
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "MotorbikeLicence{" +
                "licenceNumber='" + licenceNumber + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

}
