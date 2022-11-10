package lesson8.homework.vazifa_8_1;

public interface InterfaceCar {

    void start();
    void run();
    void stop();
    default void fly(){
        System.out.println("Default method is called");
    }
}
