package lesson_10.homework.vazifa_10_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(50);

        Random random = new Random();
        int min = 0;
        while( min < 50){
            int rand = random.nextInt(100);
            numbers.add(rand);
            min++;
        }
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
