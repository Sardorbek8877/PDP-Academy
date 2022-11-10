package lesson_12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap();
        stringIntegerHashMap.put("First", 1);
        stringIntegerHashMap.put("Second", 2);
        stringIntegerHashMap.put("Third", 3);
        stringIntegerHashMap.put("Fourth", 4);
        System.out.println(stringIntegerHashMap);

        HashMap<String, Integer> map = new HashMap<>(stringIntegerHashMap);
        System.out.println(map);

        HashMap<Integer,  String> integerStringHashMap = new HashMap<>(20);
        HashMap<String, Integer> hashmap = new HashMap<>(20, 0.8f);

        hashmap.putAll(stringIntegerHashMap);
        System.out.println(hashmap);
        hashmap.put("Fifth", 5);
        System.out.println(hashmap.put("Sixth", 6));
        System.out.println(hashmap.putIfAbsent("A", 65));
        System.out.println(hashmap);

        System.out.println(hashmap.get("Second"));
        System.out.println(hashmap.getOrDefault("Second", 85));

        System.out.println(hashmap.remove("Third"));
        System.out.println(hashmap.remove("Fifth", 5));
        System.out.println(hashmap);
        System.out.println(hashmap.containsValue(56));
//        hashmap.clear();
        System.out.println(hashmap.isEmpty());

        hashmap.forEach((key, value) -> System.out.print(key + ":" + value + "\t"));

        System.out.println();
        System.out.println(hashmap.replace("A", 95));
        System.out.println(hashmap.replace("Second", 2, 89));

        System.out.println(hashmap);
        hashmap.replaceAll((key, value) -> key.contains("S")?0:value);
        System.out.println(hashmap);

//        Set<String> keys = hashmap.keySet();
//        keys.forEach(s -> System.out.print(s + "\t"));
//        System.out.println();
//
//        Collection<Integer> values = hashmap.values();
//        values.forEach(integer -> System.out.print(integer + "\t"));
//        System.out.println();
//
//        Set<Map.Entry<String, Integer>> entries = hashmap.entrySet();
//        entries.forEach(keyValue -> System.out.print(keyValue + "\t"));
//        System.out.println();


    }
}
