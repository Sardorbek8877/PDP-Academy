package lesson9.homework.vazifa_9_1;

public class Main {

    public static void main(String[] args) {

        Sign sign = number -> {
            if( number == 0 ){
                System.out.println("Berilgan son nolga teng!");
            }
            else{
                if( number > 0 ){
                    System.out.println("Berilgan son musbat!");
                }
                else{
                    System.out.println("Berilgan son manfiy!");
                }
            }
        };

        sign.findSign(25);
        sign.findSign(0);
        sign.findSign(-13);

    }
}
