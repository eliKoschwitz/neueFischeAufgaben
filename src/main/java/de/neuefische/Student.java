package de.neuefische;

import java.util.Objects;

public class Student {
    String name;
    String ID;

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(ID, student.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID);
    }
}
