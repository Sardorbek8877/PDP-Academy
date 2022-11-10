package lesson7.homework.vazifa_7_1;

public final class Rectangle extends Shape {

    private double length;
    private double width;

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
