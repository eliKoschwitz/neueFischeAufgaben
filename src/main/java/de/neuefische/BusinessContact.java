package de.neuefische;

public class BusinessContact extends Contact{
    private String companyName;


    public BusinessContact(String companyName) {
        this.companyName = companyName;
    }

    public BusinessContact(String name, String companyName) {
        super(name);
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
