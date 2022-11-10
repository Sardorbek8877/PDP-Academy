package uz.pdp;

import uz.Teacher;

public class Main {
    public static void main(String[] args) {
        Programmer javaProgrammer = new Programmer();
        javaProgrammer.name="Sardorbek";
        javaProgrammer.sleep();

        Employee programmerEmployee = new Programmer();
        Employee doctorEmployee = new Doctor();

        Person programmerPerson = new Programmer();

        System.out.println(programmerEmployee instanceof Person);

        Teacher teacher = new Teacher();
    }
}
