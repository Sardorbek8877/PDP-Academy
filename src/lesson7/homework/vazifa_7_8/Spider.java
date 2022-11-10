package lesson7.homework.vazifa_7_8;

public final class Spider extends Animal{

    public Spider() {
    }

    public void spider(){
        System.out.println("O'rgimchak");
    }

    @Override
    public void walk() {
        System.out.println("O'zi to'qigan to'rda harakatlanadi.");
    }

    @Override
    public void eat() {
        System.out.println("Hashorotlar bilan oziqlanadi.");
    }

    @Override
    public int getLegs() {
        return super.getLegs();
    }

    @Override
    public void setLegs(int legs) {
        super.setLegs(legs);
    }
}
