package lesson8.homework.vazifa_8_4;

public class Main {

    public static void main(String[] args) {

        System.out.println("Class orqali functional Interface dan foydalanish.");
        AdditionClass addition = new AdditionClass();
        int x = addition.add(10,20);
        System.out.println("x = " + x);

        System.out.println("Anonym Class orqali functional Interface dan foydalanish.");
        Subtraction subObject = new Subtraction() {
            @Override
            public int subMethod(int a, int b) {
                return a - b;
            }
        };
        int y = subObject.subMethod(40,15);
        System.out.println("y = " + y);

        System.out.println("Lambda Expression orqali functional Interface dan foydalanish.");
        Multiply multiplyObject = (a,b) -> a * b;
        int z = multiplyObject.multiplyMethod(4,5);
        System.out.println("z = " + z);

        AdditionUpGrade add3Number = (a, b, c) -> a + b + c;
        double z1 = add3Number.addUpGrade(4,5.5,6.5);
        System.out.println("z1 = " + z1);

        Power quadrat = ( a ) -> a * a;
        int z2 = quadrat.pow(5);
        System.out.println("z2 = " + z2);

    }
}
