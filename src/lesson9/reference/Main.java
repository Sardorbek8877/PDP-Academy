package lesson9.reference;

import lesson9.model.Car;
import lesson9.model.CarFactory;
import lesson9.model.Operationable;
import lesson9.model.OtherClass;
public class Main {

    public static void main(String[] args) {

        Operationable addition = OtherClass::add;

        OtherClass other = new OtherClass();
        Operationable multiply = other::multiply;

        System.out.println(addition.calculate(4,5));
        System.out.println(multiply.calculate(4,5));

        CarFactory gm= Car::new;
        Car malibu=gm.produce("Malibu", "Qora", 2022);
        System.out.println(malibu);

    }
}
