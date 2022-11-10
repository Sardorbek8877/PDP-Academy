package lesson9;

import lesson9.model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Operationable addition = (a, b) -> a + b;
        System.out.println(addition.calculate(4, 5));

        System.out.println("Zero parameter Lmbda Expression");
        ZeroParameterInterface zeroParametr = () -> (int) (Math.random() * 100);
        System.out.println(zeroParametr.random());

        System.out.println("One parameter Lambda Expression");
        OneParameterInterface oneParameter = max -> (int)(Math.random() * max);
        System.out.println("Enter max number.");
        int max = scanner.nextInt();
        System.out.println(oneParameter.random(max));

//        System.out.println("Multiple parameter Lmbda Expression");
//        MultipleParameterInterface multipleParameter = (min, max1) -> {
//            System.out.println("Genereting parameter");
//            return (int)(Math.random() * ((max1 - min) + 1) + min);
//        };
//        System.out.print("Min: ");
//        int min = scanner.nextInt();
//        System.out.print("Max: ");
//        int max = scanner.nextInt();
//        System.out.println(multipleParameter.random(min,max));

//        Printable printable = str -> System.out.println(str);
//        printable.print("Hello!");
//
//        Operationable add = (a, b) -> a + b;
//        Operationable sub = (a, b) -> a - b;
//        Operationable multiply = (a, b) -> a * b;
//
//        System.out.println(add.calculate(4,5));
//        System.out.println(sub.calculate(4,5));
//        System.out.println(multiply.calculate(4,5));

//        Operation<Integer> addInteger = (a, b) -> a + b;
//        Operation<Double> addDouble = (a, b) -> a + b;
//        Operation<String> addString = (a, b) -> a + b;
//
//        System.out.println(addInteger.caculate(4,5));
//        System.out.println(addDouble.caculate(4.5,5.5));
//        System.out.println(addString.caculate("4","5"));
//        int[] numbers = { 12, 15, -11, 14, 17, -16};
//        Expression even = num -> num % 2 == 0;
//        Expression odd = num -> num % 2 != 0;
//        Expression isPositive = num -> num > 0;
//
//        System.out.println("Arrayning juft sonlar yig'indisi.");
//        System.out.println(sum(numbers, even));
//
//        System.out.println("Arrayning toq sonlar yig'indisi.");
//        System.out.println(sum(numbers, odd));
//
//        System.out.println("Arrayning musbat sonlar yig'indisi.");
//        System.out.println(sum(numbers, isPositive));

        System.out.println(operation("+").calculate(4, 5));
        System.out.println(operation("-").calculate(4, 5));
        System.out.println(operation("*").calculate(4, 5));
        System.out.println(operation("/").calculate(45, 5));

    }

    static int sum(int[] nums, Expression function) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (function.isEqual(nums[i])) {
                sum += nums[i];
            }
        }
        return sum;
    }

    static Operationable operation(String oper) {
        switch (oper) {
            case "+":
                return (a, b) -> a + b;
            case "-":
                return (a, b) -> a - b;
            case "*":
                return (a, b) -> a * b;
            case "/":
                return (a, b) -> a / b;
            default:
                return (a, b) -> 0;
        }
    }
}
