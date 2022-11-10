package lesson7.homework.vazifa_7_10.model;

import lesson7.homework.vazifa_7_10.service.Product;

public abstract class Electronics implements Product {

    private String model;
    private double voltage;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    @Override
    public String getFactory() {
        return null;
    }

    @Override
    public String getPrice() {
        return null;
    }
}
