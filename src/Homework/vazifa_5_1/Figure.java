package Homework.vazifa_5_1;

public class Figure {

    //To'g'ri to'rtburchakning yuzasini hisoblovchi metod
    public double area(int length, int width){
        return length * width;
    }
    //Doiraningning yuzasini hisoblovchi metod
    public double area(int radius){
        double p = 3.14;
        return p * Math.pow(radius, 2);
    }

    //To'g'ri to'rtburchakning perimetrini hisoblovchi metod
    public double perimetr(int length, int width){
        return 2 * ( length + width );
    }
    //Doiraningning perimetrini hisoblovchi metod
    public double perimetr(int radius){
        double p = 3.14;
        return 2 * p * radius;
    }

    void print(int length, int width){
        System.out.println("To'g'ri to'rtburchakning bo'yi: " + width + " ga, eni " + length + " ga teng");
    }

    void print( int radius ){
        System.out.println("Doiraning radiusi " + radius + " ga teng.");
    }
}
