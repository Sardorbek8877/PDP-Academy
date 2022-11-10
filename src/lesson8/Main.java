package lesson8;

import lesson8.model.MyClass;
import lesson8.model.MyInterface;
import lesson8.model.Operation;
import lesson8.model.Operationable;

public class Main {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        myClass.defaultMethod();

        myClass.about();

        MyClass.classStaticMethod();
        MyInterface.interfaceStaticMethod();

        System.out.println("Implementing Functional interface by class");
        Operation addition = new Operation();
        int x = addition.calculate(4,5);
        System.out.println("x = " + x);

        System.out.println("Implementing Functional interface by anonim class");
        Operationable multiply = new Operationable() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };
        x = multiply.calculate(10,20);
        System.out.println(x);

        System.out.println("Implementing Functional interface by Lambda Expression");
        Operationable sub = (a, b) -> a - b;
        x = sub.calculate(4,5);
        System.out.println(x);

    }
}
