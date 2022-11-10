package lesson9.homework.vazifa_9_4;

public class Main {

    public static void main(String[] args) {

        int[] arr = {12, 25, 54, 2, 8, 96, -25, 32, 0};

        Target target = (arr1, target1) -> {
            for (int j : arr1) {
                if( j == target1 ){
                    return true;
                }
            }
            return false;
        };

        System.out.println(target.checkTarget(arr, 32));
        System.out.println(target.checkTarget(arr, 7));
    }
}
