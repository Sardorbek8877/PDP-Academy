package lesson7.homework.vazifa_7_8;

public abstract class Animal {

    private int legs;

    public abstract void walk();

    public abstract void eat();

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
