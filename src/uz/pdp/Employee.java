package uz.pdp;

public class Employee extends Person{
    int workExperience;
    String workPlace;
    String position;
    double salary;

    public Employee() {
    }

    public Employee(String name, String surname, String birthDate, String birthCountry, String bloodGroup,
                     String address, int workExperience, String workPlace, String position, double salary) {
        super(name, surname, birthDate, birthCountry, bloodGroup, address);
        this.workExperience = workExperience;
        this.workPlace = workPlace;
        this.position = position;
        this.salary = salary;
    }
}
