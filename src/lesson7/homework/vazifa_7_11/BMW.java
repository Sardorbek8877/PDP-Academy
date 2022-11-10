package lesson7.homework.vazifa_7_11;

public class BMW extends Car{

    private double horsePower;
    private String engineCapacity;

    public void turnOn(){
        System.out.println("Mashina o't olgan.");
    }

    public void turnOf(){
        System.out.println("Mashina o'chgan.");
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
