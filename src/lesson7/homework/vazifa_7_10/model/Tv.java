package lesson7.homework.vazifa_7_10.model;

import lesson7.homework.vazifa_7_10.service.Product;
import lesson7.homework.vazifa_7_10.service.Remote;
import lesson7.homework.vazifa_7_10.service.Technique;

public final class Tv extends Electronics implements Product, Technique, Remote {
    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public String getModel() {
        return super.getModel();
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
    public String changeChannel() {
        return null;
    }

    @Override
    public String changeVoice() {
        return null;
    }

    @Override
    public String changeSetting() {
        return null;
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
