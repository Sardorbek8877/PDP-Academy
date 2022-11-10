package Homework.vazifa_6_3;

public class Triangle extends Figure{

    int sideA;
    int sideB;
    int hypotenuse;

    @Override
    public double area() {
        return sideA * sideB / 2;
    }

    @Override
    public double perimetr() {
        return sideB + sideB + hypotenuse;
    }
}
