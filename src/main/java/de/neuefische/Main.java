package de.neuefische;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Contact contactFriend = new Friend("Elias", 12304554);
        Contact contactBusiness = new BusinessContact("Bob", "BobsBurger");
        Contact[] contacts = {contactFriend,contactBusiness};

        Smartphone smartphone = new Smartphone("Samsung", "Samsung", contacts); // hier muss auch ein array übergeben werden

        Contact contactFriend2 = new Friend("Tyson", 66304554);
        Contact contactBusiness2 = new BusinessContact("Vanessa", "Carwash");
        Contact[] contacts2 = {contactFriend2,contactBusiness2};

        for(int i = 0; i < contacts.length; i++){
            smartphone.addContact(contacts2[i]);
            System.out.println(smartphone.toString());
        }

        Contact contact = smartphone.getContact(1);
        System.out.println(contact.toString());

        Contact contact2 = smartphone.getContactByName("Elias");
        System.out.println(contact2.toString());

        smartphone.removeContactByName("Bob");


    }
}