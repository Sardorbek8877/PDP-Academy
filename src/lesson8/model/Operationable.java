package lesson8.model;
@FunctionalInterface
public interface Operationable {

    double G = 9.8;

    int calculate(int a, int b);

    default void functionalInterfaceDefaultMethod(){
        System.out.println("Operationable default method is called");
    }

    static void functionalInterfaceStaticMethod(){
        System.out.println("Operationable static method is called");
    }
}
