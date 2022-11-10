package lesson8.model;

public class MyClass implements MyInterface, OtherInterface {

    @Override
    public void abstractMethod() {
        System.out.println("Overrided abstract method");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Overrided default method");
    }

    @Override
    public void about() {
        System.out.println("MyClass about method is called");
    }

    public static void classStaticMethod(){
        System.out.println("FirstClass static method is called");
    }


}
