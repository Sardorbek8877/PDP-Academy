package lesson8.model;

public interface MyInterface {

    double PI = 3.1415;
    void abstractMethod();

    default void defaultMethod(){
        System.out.println("Default method is called.");
    }

    default void about(){
        System.out.println("MyInterface about method is called");
    }

    default void test() {
        System.out.println("Test method is called");
    }

    static void interfaceStaticMethod(){
        System.out.println("Interface static method is called");
    }


}
