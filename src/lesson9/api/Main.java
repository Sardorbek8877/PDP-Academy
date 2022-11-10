package lesson9.api;

import lesson9.model.Car;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Predicate<Integer> isEven=o -> o%2==0;
//        System.out.print("Son kiriting: ");
//        int number = scanner.nextInt();
//        if( isEven.test(number)){
//            System.out.println("Bu son juft");
//        }
//        else{
//            System.out.println("Bu son toq");
//        }

//        Function<Integer, String>convert=o -> o+" dollar";
//        System.out.println(convert.apply(5));

//        Consumer<Integer> print=integer -> System.out.println(integer+" dollar");
//        print.accept(55);

        Supplier<Car> carFactory = () -> {
            Car car = new Car();
            System.out.println("Enter model");
            car.setModel(scanner.nextLine());
            System.out.println("Enter color");
            car.setColor(scanner.nextLine());
            car.setYear(2020);
            return car;
        };
        Car car = carFactory.get();
        System.out.println(car);
    }
}
