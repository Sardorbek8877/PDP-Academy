package lesson7.homework.vazifa_7_10.model;

import lesson7.homework.vazifa_7_10.service.Product;
import lesson7.homework.vazifa_7_10.service.Technique;

public final class Phone extends Electronics implements Product, Technique {

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public double getVoltage() {
        return super.getVoltage();
    }

    @Override
    public void setVoltage(double voltage) {
        super.setVoltage(voltage);
    }

    @Override
    public String getFactory() {
        return super.getFactory();
    }

    @Override
    public String getPrice() {
        return super.getPrice();
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void repair() {

    }
}
