package lesson_11.homework.vazifa_11_2;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // Elementlarni kiritish tartibida joylashtirish uchun LinkedHashSet yaratamiz
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        // Random orqali 300 dan 500 gacha bo'lgan sonlardan iborat 100 ta element qo'shamiz
        Random random = new Random();
        int min = 0;
        while (min < 100 ){
            int rand = random.nextInt(300, 500);
            linkedHashSet.add(rand);
            min++;
        }
        System.out.println(linkedHashSet);

        // 400 dan katta elementlarni o'chiramiz
        TreeSet<Integer> treeSet = new TreeSet<>(linkedHashSet);     // TreeSet yordamida LinkedHashSet imizni tartiblab olamiz
        System.out.println(treeSet);
        LinkedHashSet<Integer> result = new LinkedHashSet<>(treeSet.headSet(400)); // headSet metodi orqali 400 dan katta elementlarni tashlab yuboramiz
        System.out.println(result);
    }
}
