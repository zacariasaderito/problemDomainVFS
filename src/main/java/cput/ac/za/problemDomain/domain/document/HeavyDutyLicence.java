package cput.ac.za.problemDomain.domain.document;

public class HeavyDutyLicence implements Licence {

    private String licenceNumber;
    private String type;


    private HeavyDutyLicence(Builder builder)
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

        public HeavyDutyLicence build()
        {
            return new HeavyDutyLicence(this);
        }

    }

    @Override
    public void showLicence()
    {
        System.out.println("Licence for HEAVY DUTY VEHICLE");
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "HeavyDutyLicence{" +
                "licenceNumber='" + licenceNumber + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}




