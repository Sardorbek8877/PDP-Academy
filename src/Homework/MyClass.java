package Homework;

public class MyClass {
    int firstAttribut;
    int secondAttribut;
    MyClass(int firstAttribut, int secondAttribut){
        this.firstAttribut = firstAttribut;
        this.secondAttribut = secondAttribut;
    }
    void aboutAttributes(){
        System.out.println("Birinchi atribut: " + firstAttribut);
        System.out.println("Ikkinchi atribut: " + secondAttribut);
    }
    int sumAttributes(){
        return firstAttribut + secondAttribut;
    }
    int maxAttribut(){
        if(firstAttribut> secondAttribut){
            return firstAttribut;
        }
        return secondAttribut;
    }
}
