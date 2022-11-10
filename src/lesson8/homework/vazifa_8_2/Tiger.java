package lesson8.homework.vazifa_8_2;

public class Tiger implements Animal{

    private String placeOfResidence;
    private String typOfTiger;

    @Override
    public void soud() {

    }

    @Override
    public void eat() {
        Animal.super.eat();
    }

    public void run(){
        System.out.println("Tiger Class run method is called");
    }

    public void attack(){
        System.out.println("Tiger Class attack method is called");
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    public String getTypOfTiger() {
        return typOfTiger;
    }

    public void setTypOfTiger(String typOfTiger) {
        this.typOfTiger = typOfTiger;
    }
}
