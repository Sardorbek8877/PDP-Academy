public class Bahrom {

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 2, 6};
        System.out.println(Bahrom.funny(arr1));

    }

    public static int funny( int[] array){
        for (int i=0; i < array.length; i++){
            int sanoq = 0;
            for (int j=i; j< array.length; j++){
                if(array[i] == array[j]){
                    sanoq++;
                }
            }
            if(sanoq == array[i]){
                return array[i];
            }
        }
        return -1;
    }


    public static boolean tubSon(int son ){
        for (int i = 2; i < son; i++) {
            if (son % i == 0) {
                return false;
            }
        }
        return true;
    }
}
