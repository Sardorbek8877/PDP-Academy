package Homework.vazifa_5_1;

public class Main {
    public static void main(String[] args) {

        Figure figure = new Figure();

        System.out.println("To'g'ri to'rtburchakning yuzasi: " + figure.area(4,5));
        System.out.println("Doiraning yuzasi: " + figure.area(  4));

        System.out.println("To'g'ri to'rtburchakning perimetri: " + figure.perimetr(4,5));
        System.out.println("Doiraning perimetri: " + figure.perimetr(4));

        figure.print(4,5);
        figure.print(4);
    }
}
