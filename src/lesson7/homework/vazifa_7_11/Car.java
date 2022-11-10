package lesson7.homework.vazifa_7_11;

public abstract class Car implements WheeledVehicle{

    private int price;
    private String model;
    private String color;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move() {

    }

    @Override
    public void factory() {

    }

    @Override
    public void typeOfVehicle() {

    }

    @Override
    public void typeOfTransport() {

    }

    @Override
    public void fuel() {

    }
}
