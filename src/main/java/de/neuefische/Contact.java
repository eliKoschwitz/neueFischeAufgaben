package de.neuefische;

public abstract class Contact {
    public String name;

    public Contact() {
    }

    public Contact(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }
}
