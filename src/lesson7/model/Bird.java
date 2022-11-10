package lesson7.model;

import lesson7.service.Flyinterface;
import lesson7.service.Live;

public class Bird extends Animal implements Live, Flyinterface {

    private String type;
    private String color;
    private double weight;

    @Override
    public void voice() {
        System.out.println("Qush ovozi");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void walk() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void fly() {

    }

    @Override
    public void landing() {

    }
}
