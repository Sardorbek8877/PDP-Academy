package Homework.vazifa_5_2;

public class Main {
    public static void main(String[] args) {
        AddAttributes attribute = new AddAttributes();

        System.out.println("add(int a, int b)");
        int x = attribute.add(4,5);
        System.out.println(x);

        System.out.println("add(int a, double b)");
        double y = attribute.add(4,5.5);
        System.out.println(y);

        System.out.println("add(double a, double b, double c)");
        double z = attribute.add(4.6, 5.6, 7.8);
        System.out.println(z);

        System.out.println("add(String word1, String word2)");
        String l = attribute.add("Hello ", "World");
        System.out.println(l);

        System.out.println("add(int a, String word2)");
        String m = attribute.add(5, "Hello");
        System.out.println(m);
    }
}
