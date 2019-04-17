package cput.ac.za.problemDomain.Domain;

public abstract class Licence {


    private int licenseNumber;
    private String type;

    public Licence() {

    }


    public Licence(int licenseNumber, String type) {
        this.licenseNumber = licenseNumber;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Licence{" +
                "licenseNumber=" + licenseNumber +
                ", type='" + type + '\'' +
                '}';
    }
}
