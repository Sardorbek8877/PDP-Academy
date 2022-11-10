package lesson8.homework.vazifa_8_2;

public class Dog implements Animal{

    private String name;
    private String breeder;

    @Override
    public void soud() {

    }

    @Override
    public void eat() {
        Animal.super.eat();
    }

    public void run(){
        System.out.println("Dog Class Run method is called");
    }

    public void guard(){
        System.out.println("Dog Class Guard method is called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreeder() {
        return breeder;
    }

    public void setBreeder(String breeder) {
        this.breeder = breeder;
    }
}
