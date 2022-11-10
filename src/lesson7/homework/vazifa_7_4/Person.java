package lesson7.homework.vazifa_7_4;

public abstract class Person implements Employee{

    private String name;
    private String address;
    private String hairColor;
    private String eyeColor;

    public void newAddress( String newAddress){
        address = newAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void hire() {
        System.out.println("Hodim ishga olindi");
    }

    @Override
    public void fire() {
        System.out.println("Buni qanday amnodaligini tushunmadim");
    }
}
