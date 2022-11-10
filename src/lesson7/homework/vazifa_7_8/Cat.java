package lesson7.homework.vazifa_7_8;

public final class Cat extends Animal implements Pet{

    public Cat() {
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String setName(String name) {
        return null;
    }

    @Override
    public void walk() {

    }

    @Override
    public void eat() {
        System.out.println("Mushuklar ovqati");
    }

    @Override
    public int getLegs() {
        return super.getLegs();
    }

    @Override
    public void setLegs(int legs) {
        super.setLegs(legs);
    }

    @Override
    public void play() {
        System.out.println("O#yinchoq o'ynaydi");
    }
}
