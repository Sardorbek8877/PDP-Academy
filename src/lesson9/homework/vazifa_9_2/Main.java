package lesson9.homework.vazifa_9_2;

public class Main {

    public static void main(String[] args) {
        FindBigger big = (a, b) -> {
            if( a>b ){
                return a;
            }
            else{
                return b;
            }
        };

        System.out.println(big.findBigger(4,5));
        System.out.println(big.findBigger(4,-5));
        System.out.println(big.findBigger(-6,-2));
    }
}
