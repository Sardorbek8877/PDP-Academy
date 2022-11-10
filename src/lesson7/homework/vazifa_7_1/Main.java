package lesson7.homework.vazifa_7_1;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.color = "Qizil";
        circle.setRadius(10);
        System.out.println(circle.getColor());
        System.out.println("Doira radiusi: " + circle.getRadius());
        System.out.println("Doira yuzi: " + circle.area());

        Rectangle rectangle = new Rectangle();
        rectangle.color = "Qora";
        rectangle.setLength(20);
        rectangle.setWidth(30);
        System.out.println(rectangle.getColor());
        System.out.println("To'rtburchak tomonlari: " + rectangle.getLength() + " va "+ rectangle.getWidth());
        System.out.println("To'rtburchak yuzi: " + rectangle.area());


    }
}
