package lesson7.homework.vazifa_7_10.model;

public class Worker extends Person{

    private double salary;

    public void work(){
        System.out.println(" ");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
