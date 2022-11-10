package lesson9.homework.vazifa_9_3;

public class Main {

    public static void main(String[] args) {
        int[] arr = {12, 25, 54, 2, 8, 96, -25, 32, 0};

        Max max = arr1 -> {
            int result = arr1[0];
            for (int i = 1; i < arr1.length; i++) {
                if( arr1[i] > result ){
                    result = arr1[i];
                }
            }
            return result;
        };

        System.out.println("Massivdagi eng katta qiymat: " + max.findMax(arr));
    }
}
