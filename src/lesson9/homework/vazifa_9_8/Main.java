package lesson9.homework.vazifa_9_8;

public class Main {

    public static void main(String[] args) {
        int[] arr = {12, 25, 2, 5, 1, 3, 8, -96, 7, 11};

        SumOfPrimeNumbers primeNumbers = arr1 -> {

            int sum = 0;
            for(int i=0; i<arr1.length; i++){
                boolean isPrime = true;
                if(arr1[i] != 1 && arr1[i] > 0 ){
                    for (int j=2; j<=arr1[i]/2; j++){
                        if(arr1[i]%j==0){
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime){
                        sum += arr1[i];
                    }
                }
            }
            return sum;
        };

        System.out.println("Massivdagi tub sonlar yig'indisi: " + primeNumbers.sumOfPrimeNumbers(arr));
    }
}
