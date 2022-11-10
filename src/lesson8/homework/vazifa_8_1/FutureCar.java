package lesson8.homework.vazifa_8_1;

public class FutureCar implements InterfaceCar{

    private String typCar;
    private String factoryBrand;
    private int km;
    @Override
    public void start() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void fly() {
        InterfaceCar.super.fly();
    }

    public String getTypCar() {
        return typCar;
    }

    public void setTypCar(String typCar) {
        this.typCar = typCar;
    }

    public String getFactoryBrand() {
        return factoryBrand;
    }

    public void setFactoryBrand(String factoryBrand) {
        this.factoryBrand = factoryBrand;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
