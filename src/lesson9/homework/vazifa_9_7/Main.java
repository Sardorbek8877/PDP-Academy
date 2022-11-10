package lesson9.homework.vazifa_9_7;

public class Main {

    public static void main(String[] args) {
        int[] arr = {12, 25, -54, 2, -8, 96, -25, 31, 0};

        SumOfOdds sumOfOdd = arr1 -> {
            int sum = 0;
            for (int i = 0; i < arr1.length; i++) {
                if( arr1[i] % 2 == 1 || arr1[i] % 2 == -1 ){
                    sum += arr1[i];
                }
            }
            return sum;
        };

        System.out.println("Massivning toq elementlari yig'indisi: " + sumOfOdd.sumOfOdds( arr ));
    }
}
