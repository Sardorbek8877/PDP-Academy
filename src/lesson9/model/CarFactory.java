package lesson9.model;
@FunctionalInterface
public interface CarFactory {
    Car produce(String model, String color, int year);
}
