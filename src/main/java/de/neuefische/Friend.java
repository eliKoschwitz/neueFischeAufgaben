package de.neuefische;

public class Friend extends Contact{

    private int telefonNr;

    //1)default
    public Friend() {
    }

    //2)Overload
    public Friend(String name, int telefonNr) {
        super(name);
        this.telefonNr = telefonNr;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "telefonNr=" + telefonNr +
                ", name='" + name + '\'' +
                '}';
    }
}

