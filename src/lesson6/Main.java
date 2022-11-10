package lesson6;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.voice();

        Cat cat = new Cat();
        cat.voice();
        Animal animal = new Animal();
        animal.voice();

        Animal animalDog = new Dog();
        animalDog.voice();
    }
}
