package lesson_10.homework.vazifa_10_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Circle> circles1 = new ArrayList<>();

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();
        Circle circle5 = new Circle();

        circle1.setRadius(5.6);
        circle2.setRadius(4.7);
        circle3.setRadius(6.0);
        circle4.setRadius(5);
        circle5.setRadius(4.8);

        circles1.add(circle1);
        circles1.add(circle2);
        circles1.add(circle3);
        circles1.add(circle4);
        circles1.add(circle5);

        List<Circle> circles2 = new ArrayList<>(circles1);

        for (int i = 0; i < circles1.size(); i++) {
            System.out.print(circles1.get(i).getRadius() + "\t");
        }

        System.out.println();
        for (int i = 0; i < circles2.size(); i++) {
            System.out.print(circles2.get(i).getRadius() + "\t");
        }
    }
}
