package lesson8.homework.vazifa_8_2;

public class Cat implements Animal{

    private String name;
    private String typ;

    @Override
    public void soud() {

    }

    @Override
    public void eat() {
        Animal.super.eat();
    }

    public void run(){
        System.out.println("Cat Class run method is called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
}
