package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class StudentDBTest {

    @Test
    void createStudentWithIdAndName(){
        // GIVEN
        String ID = "1";
        String name = "Elias";
        // WHEN
        Student student = new Student(name, ID);
        String expected = "Student{" +
                "name='" + "Elias" + '\'' +
                ", ID='" + "1" + '\'' +
                '}';
        // THEN
        Assertions.assertEquals(expected ,student.toString());
    }

    @Test
    void allStudentsInArray(){
        // GIVEN
        Student[] student = {new Student("1", "Elias"), new Student("2", "Fabian") };
        StudentDB db = new StudentDB(student);
        // WHEN
        Student[] studentArr = db.getAllStudents();
        // THEN
        Assertions.assertEquals(student ,studentArr);
    }

    @Test
    void allStudentsToString(){
        // GIVEN
        Student[] student = {new Student("1", "Elias"), new Student("2", "Fabian") };
        StudentDB db = new StudentDB(student);
        // WHEN
        String actual = db.toString();
        String expected = "StudentDB{" +
                "student=" + Arrays.toString(student) +
                '}';
        // THEN
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void main(){
        Student[] student = {new Student("1", "Elias"), new Student("2", "Fabian") };
        StudentDB db = new StudentDB(student);
        db.randomStudent();
    }

}