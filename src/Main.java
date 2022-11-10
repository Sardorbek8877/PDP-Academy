import Homework.Point;

public class Main {

    public static void main(String[] args) {

//        Car car1 = new Car();
////        car1.km = 100;
//        car1.color = "Qora";
//        car1.model = "Tracker";
////        car1.maxSpeed = 220;
//        car1.number = "01 A777AA";
////        car1.year = 2020;
//
//        Car car2 = new Car();
////        car2.year = 2019;
//        car2.number = "10 B888BB";
////        car2.maxSpeed = 240;
//        car2.model = "Malibu";
//        car2.color = "Oq";
////        car2.km = 1500;
//        car2.state = true;
//
//        System.out.println("=====car1=====");
//        System.out.println("Model: " + car1.model);
//        System.out.println("Mashina raqami: " + car1.number);
//        System.out.println("Ishlab chiqarilgan yili: " + car1.year);
//        System.out.println("Kuzov ranggi: " + car1.color);
//        System.out.println("Holati: " + car1.km);
//
//        System.out.println("=====car2=====");
//        System.out.println("Model: " + car2.model);
//        System.out.println("Mashina raqami: " + car2.number);
//        System.out.println("Ishlab chiqarilgan yili: " + car2.year);
//        System.out.println("Kuzov ranggi: " + car2.color);
//        System.out.println("Holati: " + car2.km);
//
//        System.out.println("\n=====Obyektlarning metodlarini ishlatish=====");
//
//        System.out.println("=====car1=====");
//        car1.startOn();
//        System.out.println("Model: " + car1.model);
//        System.out.println("Mashina raqami: " + car1.number);
//        System.out.println("Ishlab chiqarilgan yili: " + car1.year);
//        System.out.println("Kuzov ranggi: " + car1.color);
//        System.out.println("Holati: " + car1.km);
//
//        System.out.println("=====car2=====");
//        car2.startOff();
//        System.out.println("Model: " + car2.model);
//        System.out.println("Mashina raqami: " + car2.number);
//        System.out.println("Ishlab chiqarilgan yili: " + car2.year);
//        System.out.println("Kuzov ranggi: " + car2.color);
//        System.out.println("Holati: " + car2.km);
//
//        Car car3 = new Car("Cobalt", "Oq", "95 A695EA", 2022, 260, 35000);
//
//        System.out.println("=====car3=====");
//        System.out.println("Model: " + car3.model);
//        System.out.println("Mashina raqami: " + car3.number);
//        System.out.println("Ishlab chiqarilgan yili: " + car3.year);
//        System.out.println("Kuzov ranggi: " + car3.color);
//        System.out.println("Holati: " + car3.km);
//
//        Car car4 = new Car("Lacetti", "Qora", "95 N256MA", 2022, 220, 60300);
//
//        System.out.println(car4.km);
//        System.out.println("=====car4 ning drive metodi chaqiriligandan keyin=====");
//        car4.drive(200);
//        System.out.println(car4.km);
//
//        Pen ruchka = new Pen(100, "Ko'k", 10);
//        ruchka.clickButton();
//        System.out.println(ruchka.getInk());
//        ruchka.write("Java OOP");
//        System.out.println(ruchka.getInk());
//        ruchka.write("Hello OOP");

//        System.out.println("=====Pen object=====");
//        Pen pen = new Pen();
//        pen.setInk(100);
//        pen.setInkConsumption(10);
//        System.out.println(pen.getInk());
//        pen.clickButton();
//        pen.write("Hello World!");
//        System.out.println(pen.getInk());
        Calculator calculator = new Calculator();
        System.out.println("add(int a, int b)");
        int x = calculator.add(4,5);
        System.out.println(x);

        System.out.println("add(int a, int b, int c)");
        int y = calculator.add(4,5,6);
        System.out.println(y);

        System.out.println("add(int a, int b, double c)");
        double z = calculator.add(4.6, 5.6);
        System.out.println(z);

        System.out.println("add(int a, int b, double c)");
        String l = calculator.add(4,5,5.6);
        System.out.println(l);


        System.out.println(Bahrom.tubSon(100));
    }
}
