package lesson_11.homework.vazifa_11_1;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Olma");
        hashSet.add("Uzum");
        hashSet.add("Anor");
        hashSet.add("Nok");
        hashSet.add("Olcha");
        hashSet.add("Apelsin");
        hashSet.add("Limon");
        hashSet.add("Mandarin");
        hashSet.add("Banan");
        hashSet.add("Mango");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + "\t");
        }

        hashSet.forEach(s -> System.out.println(s));
    }
}
