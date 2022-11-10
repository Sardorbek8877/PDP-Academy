package lesson7.homework.vazifa_7_10.model;

public class Student extends Person{

    private String nameOfUniversity;
    private double stipendium;

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public double getStipendium() {
        return stipendium;
    }

    public void setStipendium(double stipendium) {
        this.stipendium = stipendium;
    }
}
