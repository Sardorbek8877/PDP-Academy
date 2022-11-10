package Homework;

public class Student {
    String name;
    String surname;
    int number;
    String[] subjects;

    Student(String name, String surname, int number, String[] subjects){
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.subjects = subjects;
    }
    void printSubjects(){
        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + ", ");
        }
    }
}
