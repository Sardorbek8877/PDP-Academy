package lesson9.homework.vazifa_9_5;

public class Main {

    public static void main(String[] args) {

        int[] arr = {12, 25, 54, 2, 8, 96, -25, 32, 0};

        Sum sumNumbers = arr1 -> {
            int sum = 0;
            for (int i = 0; i < arr1.length; i++) {
                sum += arr1[i];
            }
            return sum;
        };

        System.out.println(sumNumbers.sum(arr));
    }
}
