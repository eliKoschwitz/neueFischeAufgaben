package de.neuefische;

import java.util.Arrays;

public class StudentDB {
    private Student[] student;

    public StudentDB(Student[] student) {
        this.student = student;
    }

    public Student[] getAllStudents() {
        return student;
    }

    public Student randomStudent (){
        Student[] students = getAllStudents();
        int max = students.length;
        int i = (int) (Math.random() * (max - 0) + 0);
        Student randomStudent = students[i];
        System.out.println(randomStudent.toString());
        return randomStudent;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "student=" + Arrays.toString(student) +
                '}';
    }
}
