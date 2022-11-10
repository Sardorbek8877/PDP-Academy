package Homework.vazifa_6_3;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.radius = 20;
        System.out.println("Radiusi 20 ga teng bo'lgan doiraning yuzi: " + circle.area());
        System.out.println("Radiusi 20 ga teng bo'lgan doiraning perimetri: " + circle.perimetr());

        Triangle triangle = new Triangle();
        triangle.sideA = 3;
        triangle.sideB = 4;
        triangle.hypotenuse = 5;
        System.out.println("Tomonlari 3,4,5 bo'lgan uchburchak yuzi: " + triangle.area());
        System.out.println("Tomonlari 3,4,5 bo'lgan uchburchak perimetri: " + triangle.perimetr());

        Rectangle rectangle = new Rectangle();
        rectangle.sideA = 15;
        rectangle.sideB = 20;
        System.out.println("Tomonlari 15 va 20 bo'lgan to'rtburchak yuzi: " + rectangle.area());
        System.out.println("Tomonlari 15 va 20 bo'lgan to'rtburchak perimetri: " + rectangle.perimetr());
    }
}
