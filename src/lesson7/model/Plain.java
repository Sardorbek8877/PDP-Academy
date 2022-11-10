package lesson7.model;

import lesson7.service.Flyinterface;
import lesson7.service.Technique;

public class Plain implements Flyinterface, Technique {

    private String model;
    private int capacita;        // qancha odam sig'ishi
    private int numberOfEngine;  //motorlar soni
    @Override
    public void fly() {

    }

    @Override
    public void landing() {

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacita() {
        return capacita;
    }

    public void setCapacita(int capacita) {
        this.capacita = capacita;
    }

    public int getNumberOfEngine() {
        return numberOfEngine;
    }

    public void setNumberOfEngine(int numberOfEngine) {
        this.numberOfEngine = numberOfEngine;
    }
}
