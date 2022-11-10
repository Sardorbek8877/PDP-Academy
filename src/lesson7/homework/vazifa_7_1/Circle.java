package lesson7.homework.vazifa_7_1;

public final class Circle extends Shape{

    private final double PI=3.14;
    private double radius;

    @Override
    public double area() {
        return PI*radius*radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
