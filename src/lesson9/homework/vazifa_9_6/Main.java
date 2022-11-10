package lesson9.homework.vazifa_9_6;

public class Main {

    public static void main(String[] args) {

        int[] arr = {12, 25, -54, 2, -8, 96, -25, 32, 0};

        SumOfPositives sum = arr1 -> {
            int sumOfNumbers = 0;
            for (int i : arr1 ) {
                if( i > 0 ){
                    sumOfNumbers += i;
                }
            }
            return sumOfNumbers;
        };
        System.out.println("Massivning musbat elementlari yig'indisi: " + sum.sumOfPositives( arr ));

    }

}
