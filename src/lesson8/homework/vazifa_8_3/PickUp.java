package lesson8.homework.vazifa_8_3;

public class PickUp implements CargoAuto, PassengersAuto{

    public void transportCargo() {
        System.out.println("Method is called");
    }

    @Override
    public void transportPassengers() {
        PassengersAuto.super.transportPassengers();
    }
}
