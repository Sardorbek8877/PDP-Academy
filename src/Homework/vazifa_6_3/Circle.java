package Homework.vazifa_6_3;

public class Circle extends Figure{

    int radius;
    double PI=3.14;

    @Override
    public double area() {
        return PI * radius*radius;
    }

    @Override
    public double perimetr() {
        return 2 * PI * radius;
    }
}
