package Homework.vazifa_6_3;

public class Rectangle extends Figure{

    int sideA;
    int sideB;

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimetr() {
        return 2 * (sideA + sideB);
    }
}
