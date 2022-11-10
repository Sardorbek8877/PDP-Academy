package Homework;

public class Employee {

    private String name;
    private String surname;
    private int idNumber;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String surname, int idNumber, int salary) {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
