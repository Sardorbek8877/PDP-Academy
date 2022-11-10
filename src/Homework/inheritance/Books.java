package Homework.inheritance;

public class Books {

    String autor;
    int price;
    int sale;
    String title;
    int numberOfPages;

    void calculatePrice(){
        System.out.println(price-(price/100)*sale);
    }

    void calculateCustoms(){
        System.out.println((price/100)*30);
    }
}
