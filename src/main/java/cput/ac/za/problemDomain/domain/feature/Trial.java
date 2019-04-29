package cput.ac.za.problemDomain.domain.feature;


public class Trial {

    private String requestNumber;
    private String veredict;


    //  Default constructor
    private Trial() {
    }

    private Trial(Builder builder)
    {
        this.requestNumber = builder.requestNumber;
        this.veredict = builder.veredict;
    }

//  Getters
    public String getRequestNumber() {
        return requestNumber;
    }

    public String getVeredict() {
        return veredict;
    }

//    Builder
    public static class Builder
    {
        private String requestNumber;
        private String veredict;


        public Builder requestNumber(String requestNumber)
        {
            this.requestNumber = requestNumber;
            return this;
        }

        public Builder veredict(String veredict)
        {
            this.veredict = veredict;
            return this;
        }

        public Trial build()
        {
            return new Trial(this);
        }


    }

}