package Homework;

public class Book {

    private String name;
    private String[] autors;
    private int price;
    private long isbn;

    public Book() {
    }
    public Book(String name, String[] autors, int price, long isbn) {
        this.name = name;
        this.autors = autors;
        this.price = price;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAutors() {
        return autors;
    }

    public void setAutors(String[] autors) {
        this.autors = autors;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        String isbnString = String.valueOf(isbn);
        if(isbnString.length()==13){
            this.isbn = isbn;
        }
        else System.out.println("ISBN 13 ta raqamdan iborat bo'lishi kerak.");

    }

    public void showName(){
        System.out.println("Kitobning nomi: " + name);
    }
    public void showAutors(){
        System.out.println("Kitob avtorlari: ");
        for (String autor : autors) {
            System.out.print(autor + " ");
        }
    }
}
