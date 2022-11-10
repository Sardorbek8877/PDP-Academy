package Homework;

public class Triangle {
    int catheter1;
    int catheter2;
    Triangle(int catheter1, int catheter2){
        this.catheter1 = catheter1;
        this.catheter2 = catheter2;
    }
    double perimeter(){
        double hypotenuse = Math.sqrt(catheter1*catheter1+catheter2*catheter2);
        return catheter1 + catheter2 + hypotenuse;
    }
    int surface(){
        return (catheter1 * catheter2)/2;
    }
}
