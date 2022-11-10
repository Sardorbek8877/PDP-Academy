public class Car {

    String model;
    String color;
    String number; // davlat raqami
    int year; // ishlab chiqarilgan yili
    int maxSpeed;
    double km;
    boolean state;

//    Car(){
//
//    }
    Car(){
        year = 2020;
        maxSpeed = 200;
        km = 100;
    }

    Car(String model, String color, String number, int year, int maxSpeed, double km){
        this.model = model;
        this.color = color;
        this.number = number;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.km = km;
    }

    void startOn(){
        state=true;
        System.out.println("Mashina o't oldi.");
    }
    void startOff(){
        state=false;
        System.out.println("Mashina o'chdi.");
    }
    void drive(double distance){
        km += distance;
        System.out.println("Mashina " + distance + " masofani bosib o'tdi");
    }

}
