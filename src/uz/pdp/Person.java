package uz.pdp;

public class Person {
    public String name;
    protected String surname;
    String birthDate;
    private String birthCountry;
    String bloodGroup;
    String address;

    public Person() {
    }

    public Person(String name, String surname, String birthDate, String birthCountry, String bloodGroup, String address) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.birthCountry = birthCountry;
        this.bloodGroup = bloodGroup;
        this.address = address;
    }

    void sleep(){
        System.out.println("Men uhlayabman.");
    }
}
