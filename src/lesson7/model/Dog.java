package lesson7.model;

import lesson7.service.Live;

public final class Dog extends Animal implements Live {
    public void voice(){
        System.out.println("Woof");
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
}
