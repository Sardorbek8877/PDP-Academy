package lesson_10.homework.vazifa_10_4;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Sardor");
        list.add("Davron");
        list.add("Azam");
        list.add("Shokir");
        list.add("Bobur");
        list.add("Vali");
        list.add("Yodgor");
        list.add("Bekzod");
        list.add("Ali");
        list.add("Alisher");

        System.out.println("===== Listni sortlash======");
        List<String> sortedList = new ArrayList<>(list.stream().sorted().toList());
        sortedList.forEach(System.out::println);

        System.out.println("=====A harfidan boshlanadigan ismlarni o'chirish=====");
//        for ( int i=0; i< list.size(); i++){
//            String firstWord = list.get(i).substring(0,1);
//            if( firstWord.equals("A")){
//                list.remove(i);
//            }
//        }
//        System.out.println(list);

        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list);
    }
}
