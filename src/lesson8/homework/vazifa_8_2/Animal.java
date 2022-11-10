package lesson8.homework.vazifa_8_2;

public interface Animal {

    void soud();
    default void eat(){
        System.out.println("Food");
    }

    static void run(){
        System.out.println("Static method is called");
    }
}
