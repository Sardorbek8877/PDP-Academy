package Homework.vazifa_5_3;

public class Main {
    public static void main(String[] args) {
        //Calculator calculator = new Calculator();

        System.out.println("add(int a, int b)");
        int ii = Calculator.add(4,5);
        System.out.println(ii);

        System.out.println("add(int a, double b)");
        double id = Calculator.add(4,5.5);
        System.out.println(id);

        System.out.println("add(double a, int b)");
        double di = Calculator.add(4.6, 5);
        System.out.println(di);

        System.out.println("add(int a, long b)");
        long il = Calculator.add(5, 123456789123L);
        System.out.println(il);

        System.out.println("add(long a, int b)");
        long li = Calculator.add(123456789123L, 5);
        System.out.println(li);

        System.out.println("add(double a, double b)");
        double dd = Calculator.add(4.6, 5.5);
        System.out.println(dd);

        System.out.println("add(double a, long b)");
        double dl = Calculator.add(4.6, 123456789123L);
        System.out.println(dl);

        System.out.println("add(long a, double b)");
        double ld = Calculator.add(123456789123L, 5.5);
        System.out.println(ld);

        System.out.println("add(long a, long b)");
        long ll = Calculator.add(123456789123L, 123456789123L);
        System.out.println(ll);

        System.out.println("sub(int a, int b)");
        int ii1 = Calculator.sub(4,5);
        System.out.println(ii1);

        System.out.println("sub(int a, double b)");
        double id1 = Calculator.sub(4,5.5);
        System.out.println(id1);

        System.out.println("sub(double a, int b)");
        double di1 = Calculator.sub(4.6, 5);
        System.out.println(di1);

        System.out.println("sub(int a, long b)");
        long il1 = Calculator.sub(5, 123456789123L);
        System.out.println(il1);

        System.out.println("sub(long a, int b)");
        long li1 = Calculator.sub(123456789123L, 5);
        System.out.println(li1);

        System.out.println("sub(double a, double b)");
        double dd1 = Calculator.sub(4.6, 5.5);
        System.out.println(dd1);

        System.out.println("sub(double a, long b)");
        double dl1 = Calculator.sub(4.6, 123456789123L);
        System.out.println(dl1);

        System.out.println("sub(long a, double b)");
        double ld1 = Calculator.sub(123456789123L, 5.5);
        System.out.println(ld1);

        System.out.println("sub(long a, long b)");
        long ll1 = Calculator.sub(123456789123L, 9123456789123L);
        System.out.println(ll1);

        System.out.println("multiply(int a, int b)");
        int ii2 = Calculator.multiply(4,5);
        System.out.println(ii2);

        System.out.println("multiply(int a, double b)");
        double id2 = Calculator.multiply(4,5.5);
        System.out.println(id2);

        System.out.println("multiply(double a, int b)");
        double di2 = Calculator.multiply(4.6, 5);
        System.out.println(di2);

        System.out.println("multiply(int a, long b)");
        long il2 = Calculator.multiply(5, 123456789123L);
        System.out.println(il2);

        System.out.println("multiply(long a, int b)");
        long li2 = Calculator.multiply(123456789123L, 5);
        System.out.println(li2);

        System.out.println("multiply(double a, double b)");
        double dd2 = Calculator.multiply(4.6, 5.5);
        System.out.println(dd2);

        System.out.println("multiply(double a, long b)");
        double dl2 = Calculator.multiply(4.6, 123456789123L);
        System.out.println(dl2);

        System.out.println("multiply(long a, double b)");
        double ld2 = Calculator.multiply(123456789123L, 5.5);
        System.out.println(ld2);

        System.out.println("multiply(long a, long b)");
        long ll2 = Calculator.multiply(123456789123L, 123456789123L);
        System.out.println(ll2);

        System.out.println("div(int a, int b)");
        int ii3 = Calculator.div(4,5);
        System.out.println(ii3);

        System.out.println("div(int a, double b)");
        double id3 = Calculator.div(4,5.5);
        System.out.println(id3);

        System.out.println("div(double a, int b)");
        double di3 = Calculator.div(4.6, 5);
        System.out.println(di3);

        System.out.println("div(int a, long b)");
        long il3 = Calculator.div(5, 123456789123L);
        System.out.println(il3);

        System.out.println("div(long a, int b)");
        long li3 = Calculator.div(123456789123L, 5);
        System.out.println(li3);

        System.out.println("div(double a, double b)");
        double dd3 = Calculator.div(4.6, 5.5);
        System.out.println(dd3);

        System.out.println("div(double a, long b)");
        double dl3 = Calculator.div(4.6, 123456789123L);
        System.out.println(dl3);

        System.out.println("div(long a, double b)");
        double ld3 = Calculator.div(123456789123L, 5.5);
        System.out.println(ld3);

        System.out.println("div(long a, long b)");
        long ll3 = Calculator.div(123456789123L, 123456789123L);
        System.out.println(ll3);

        System.out.println("abs(int a)");
        int abs1 = Calculator.abs(8);
        System.out.println(abs1);

        System.out.println("abs(double a)");
        double abs2 = Calculator.abs(8.8);
        System.out.println(abs2);

        System.out.println("abs(long a)");
        long abs3 = Calculator.abs(123456789123L);
        System.out.println(abs3);

        System.out.println("pow(int a)");
        int pow1 = Calculator.abs(8);
        System.out.println(pow1);

        System.out.println("pow(double a)");
        double pow2 = Calculator.abs(8.8);
        System.out.println(pow2);

        System.out.println("pow(long a)");
        long pow3 = Calculator.abs(1234567891234L);
        System.out.println(pow3);
    }
}
