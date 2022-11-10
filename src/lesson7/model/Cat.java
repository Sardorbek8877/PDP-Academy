package lesson7.model;

import lesson7.service.Flyinterface;
import lesson7.service.Live;

public final class Cat extends Animal implements Live, Flyinterface {

    @Override
    public void voice() {
        System.out.println("Meow.");
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

    @Override
    public void fly() {

    }

    @Override
    public void landing() {

    }
}
