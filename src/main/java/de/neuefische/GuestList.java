package de.neuefische;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GuestList {

    private List<String> guestList;

    public GuestList() {
    }

    void setGuests(List <String> guestList) {
        this.guestList = guestList;
    }

    List<String> getGuests(){
        return guestList;
    }

    public void createGuestList() throws IOException {
        Path path = Path.of("/Users/eliaskoschwitz/IdeaProjects/NeueFische/neuefischeaufgaben/neuefische/guestList.txt");
    //    Files.delete(path);
        Files.createFile(path);
    }

    public void writeNamesInGuestList(List<String> gList) throws IOException {
        Path path = Path.of("/Users/eliaskoschwitz/IdeaProjects/NeueFische/neuefischeaufgaben/neuefische/guestList.txt");
        setGuests(gList);
        //String[] messages = null;
        String name = "";
        String space = "";

        for(int i = 0; i < guestList.size(); i++) {
            if(i == 1){
                space = " ";
            }
            name = name + space + getGuests().get(i);
        }
        Files.write(path, (name).getBytes()); // die write methode will das man eine IOException hinzufügt
        //Files.delete(path);

        /*
        hier wird gestreamt
        for(int i = 0; i < messages.length; i++) {
            List<String> stringL = Stream.of(messages[i]).collect(Collectors.toList());
        }
         */
    }

    public String readNamesInGuestList() throws IOException {
        Path path = Path.of("/Users/eliaskoschwitz/IdeaProjects/NeueFische/neuefischeaufgaben/neuefische/guestList.txt");
        List<String> stringL = Files.lines(path).collect(Collectors.toList());
        String space = "";
        String names = "";
        for(int i = 0; i < stringL.size(); i++) {
            if(i == 1){
                space = " ";
            }
            names = names + space + stringL.get(i);

           stringL  = Files.readAllLines(path);
        }
        return names;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuestList guestList1 = (GuestList) o;
        return Objects.equals(guestList, guestList1.guestList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guestList);
    }
}
