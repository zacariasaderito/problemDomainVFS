package cput.ac.za.problemDomain.domain.person;


public class Officer {

    private String officerID;
    private String name;
    private String post;

    //  Default constructor
    private Officer() {
    }

    private Officer(Builder builder)
    {
        this.officerID = builder.officerID;
        this.name = builder.name;
        this.post = builder.post;
    }

//    Getters
    public String getOfficerID() {
        return officerID;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }


    //    Builder
    public static class Builder {

        private String officerID;
        private String name;
        private String post;

        public Builder officerID(String officerID)
        {
            this.officerID = officerID;
            return this;
        }

        public Builder name(String name)
        {
            this.name = name;
            return this;

        }

        public Builder post(String post)
        {
            this.post = post;
            return this;
        }

        public Officer build()
        {
            return new Officer(this);
        }


    }

}