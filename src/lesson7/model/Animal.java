package lesson7.model;

public abstract class Animal {
    private int age;
    private static final int NUMBER_OF_EYES = 2;

    public abstract void voice();

    public void about(){
        System.out.println("age: " + age);
    }
}
