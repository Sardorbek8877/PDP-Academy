package lesson9.variable;

import lesson9.model.Operationable;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {

    static int x;
    int y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = 7;
        Operationable addition = (a, b) -> {
            System.out.println("x = ");
            x = scanner.nextInt();
            x += z;

            //this.y = scanner.nextInt();
            return a+b;
        };
       // z = 9;  // mumkin emas
    }
}
