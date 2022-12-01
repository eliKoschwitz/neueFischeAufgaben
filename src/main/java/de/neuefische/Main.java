package de.neuefische;

import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        LocalDate localDate = LocalDate.now(ZoneId.of("Europe/Berlin"));
        System.out.println(localDate);
    }
}