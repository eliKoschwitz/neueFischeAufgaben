package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


class FileBasedGuestListTest {
    @Test
    void shouldBeEmptyInitially() {
        // GIVEN
        GuestList guestList = new GuestList();
        List<String> myList = new ArrayList<>();
        guestList.setGuests(myList);
        // WHEN
        List<String> actual = guestList.getGuests();
        // THEN
        List<String> emptyList = new ArrayList<>();
        Assertions.assertEquals(emptyList, actual);
    }

    @Test
    void shouldReadSameGuestsAsWrittenBefore() {
        // GIVEN
        GuestList guestList = new GuestList();
        List<String> myList = new ArrayList<>();
        myList.add("Karl");
        myList.add("Ute");
        guestList.setGuests(myList);
        // WHEN
        List<String> actual = guestList.getGuests();
        // THEN
        Assertions.assertEquals(myList, actual);
    }

    @Test
    void doesTheFileExist() throws Exception {
        Path path = Paths.get("/Users/eliaskoschwitz/IdeaProjects/NeueFische/neuefischeaufgaben/neuefische/guestList.txt");
        GuestList guestList = new GuestList();
        guestList.createGuestList();
        Assertions.assertTrue(Files.exists(path));
    }

    @Test
    void shouldWriteToFileFileSystem() throws Exception {
        // GIVEN
        Path path = Paths.get("/Users/eliaskoschwitz/IdeaProjects/NeueFische/neuefischeaufgaben/neuefische/guestList.txt");
        GuestList guestList = new GuestList();
        List<String> gList = new ArrayList<>();
        gList.add("Theodor");
        gList.add("Anette");
        // WHEN
        guestList.writeNamesInGuestList(gList);
        String actual = new String(Files.readAllBytes(path));
        // THEN
        //List<String> expected = gList;
        String expected = "Theodor Anette";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReadToFileFileSystem() throws IOException {
        // GIVEN
        Path path = Paths.get("/Users/eliaskoschwitz/IdeaProjects/NeueFische/neuefischeaufgaben/neuefische/guestList.txt");
        GuestList guestList = new GuestList();
        List<String> gList = new ArrayList<>();
        gList.add("Stephan");
        gList.add("Max");
        // WHEN
        guestList.writeNamesInGuestList(gList);
        String guests = guestList.readNamesInGuestList();

        //String actual = new String(Files.readAllBytes(path)); // files sagt, IOException muss eingefügt werden

        // THEN
        String expected = "Stephan Max";
        Assertions.assertEquals(expected, guests);
    }

    @Test
    void doesTheFileExistThrowExceptionIfNot () {
        File path = Paths.get("/Users/eliaskoschwitz/IdeaProjects/NeueFische/neuefischeaufgaben/neuefische/guestList.txt").toFile();

        // SETUP
        if (path.exists()) {
            path.delete();
        }
        // GIVEN
        GuestList guestList = new GuestList();
        // WHEN
        try {
            guestList.readNamesInGuestList();
            Assertions.fail();
        } catch (IOException e) {
            // THEN
            Assertions.assertTrue(true);
        }
    }
    // TODO hier noch die letzte Aufgabe machen einen Guest muss geaddet werden.
    @Test
    void isThereANewGuest() {
        // GIVEN
        String guest = "Elias";
        GuestList guestList = new GuestList();
        // WHEN
        guestList.addGuest(guest);
        // THEN

    }
}
