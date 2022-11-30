package de.neuefische;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Smartphone implements Radio, GPS{

    private String nameOfTheModel;
    private String nameOfTheManufacturer;
    private Contact[] contactList;

    public Smartphone() {
    }

    public Smartphone(String nameOfTheModel, String nameOfTheManufacturer, Contact[] contactList) {
        this.nameOfTheModel = nameOfTheModel;
        this.nameOfTheManufacturer = nameOfTheManufacturer;
        this.contactList = contactList;
    }

    public String getNameOfTheModel() {
        return nameOfTheModel;
    }

    public void setNameOfTheModel(String nameOfTheModel) {
        this.nameOfTheModel = nameOfTheModel;
    }

    public String getNameOfTheManufacturer() {
        return nameOfTheManufacturer;
    }

    public void setNameOfTheManufacturer(String nameOfTheManufacturer) {
        this.nameOfTheManufacturer = nameOfTheManufacturer;
    }

    public Contact[] getContactList() {
        return contactList;
    }

    public void setContactList(Contact[] contactList) {
        this.contactList = contactList;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "nameOfTheModel='" + nameOfTheModel + '\'' +
                ", nameOfTheManufacturer='" + nameOfTheManufacturer + '\'' +
                ", contactList=" + Arrays.toString(contactList) +
                '}';
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.print("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    public void addContact(Contact contact){
        Contact[] sContactList = new Contact[contactList.length + 1];

        for(int i = 0; i < contactList.length ; i++) {
            sContactList[i] = contactList[i];
        }
        sContactList[sContactList.length-1] = contact;
        contactList = sContactList;

        /*
        einfache Möglichkeit

        contactList = Arrays.copyOf(contactList, contactList.length+1);
        contactList[contactList.length-1] = contact;
        */
    }

    public Contact getContact(int index){
        Contact contact = contactList[index];
        return contact;
    }

    public Contact getContactByName(String name){
        for(Contact contact : contactList){
            if (contact.getName() == name){
                return contact;
            }
        }
        return null;
    }

    public void removeContactByName(String name){
        Contact[] sContactList= new Contact[contactList.length - 1];

        System.out.println("sContactList"+sContactList.length);
        System.out.println("contactList"+contactList.length);

        System.out.println("Data"+contactList.toString());

        int j = 0;
        for(int i = 0; i < sContactList.length ; i++){
            Contact contact = contactList[i];
            if (name == contact.getName()) {
                //j--;
                continue;
            }
            sContactList[j] = contactList[i];
            j++;
        }
        contactList = sContactList;
        for(int i = 0; i < contactList.length; i++){
            Contact contact = contactList[i];
            System.out.println("" + contact);
            System.out.println("Noch im Array"+ contact.toString());
        }
    }
}

