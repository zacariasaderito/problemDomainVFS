package cput.ac.za.problemDomain.domain.person;

import cput.ac.za.problemDomain.domain.document.Licence;
import cput.ac.za.problemDomain.factory.document.LicenseFactory;


public class Driver {

    private String id;
    private String name;
    private int age;
    private String address;
    private int phoneNumber;
    private Licence licence;


//  Builder
    private Driver(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.licence = builder.licence;
    }

    // Getters


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    // Get factory
    public Licence getLicence(String type)
    {
        licence = LicenseFactory.createLicense(type);
        return licence;
    }


    public void commitViolence() {}


    public static class Builder {

        private String id;
        private String name;
        private int age;
        private String address;
        private int phoneNumber;
        private Licence licence;

        public Builder id(String id)
        {
            this.id = id;
            return this;
        }

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder age(int age)
        {
            this.age = age;
            return this;
        }


        public Builder address(String address)
        {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(int phoneNumber)
        {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder licence(Licence licence)
        {
            this.licence = licence;
            return this;
        }

        public Driver build()
        {
            return new Driver(this);
        }





    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", licence=" + licence +
                '}';
    }

}
