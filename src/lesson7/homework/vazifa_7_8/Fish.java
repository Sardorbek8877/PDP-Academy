package lesson7.homework.vazifa_7_8;

public final class Fish extends Animal implements Pet{

    public Fish() {
    }

    @Override
    public void walk() {
        System.out.println("Akvariumda suzish");
    }

    @Override
    public void eat() {
        System.out.println("Baliqlar ovqati");
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
    public String getName() {
        return null;
    }

    @Override
    public String setName(String name) {
        return null;
    }

    @Override
    public void play() {
        System.out.println("Baliq");
    }
}
