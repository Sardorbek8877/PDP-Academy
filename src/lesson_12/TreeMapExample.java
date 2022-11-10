package lesson_12;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("AB", 45);
        treeMap.put("BA", 65);
        treeMap.put("AC", 25);
        treeMap.put("CA", 15);
        System.out.println(treeMap);

//        MyComparator myComparator = new MyComparator();
        TreeMap<String, Integer> stringIntegerTreeMap = new TreeMap<>((o1, o2) -> o2.compareTo(o1));
        stringIntegerTreeMap.put("AB", 45);
        stringIntegerTreeMap.put("BA", 65);
        stringIntegerTreeMap.put("AC", 25);
        stringIntegerTreeMap.put("CA", 15);
        System.out.println(stringIntegerTreeMap);

        TreeMap<Integer, String>  integerStringTreeMap= new TreeMap<>();
        integerStringTreeMap.put(15, "AAAA");
        integerStringTreeMap.put(25, "DDDD");
        integerStringTreeMap.put(5, "CCCC");
        integerStringTreeMap.put(45, "ADADA");
        Map.Entry<Integer, String> ce = integerStringTreeMap.ceilingEntry(10);
        System.out.println(ce);

        Integer ck = integerStringTreeMap.ceilingKey(20);
        System.out.println(ck);

        Set<Integer> keySet = integerStringTreeMap.keySet();
        System.out.println(keySet);
        Set<Integer> descendingKeySet = integerStringTreeMap.descendingKeySet();
        System.out.println(descendingKeySet);

        System.out.println(integerStringTreeMap);
        System.out.println(integerStringTreeMap.descendingMap());

        System.out.println(integerStringTreeMap.subMap(15, 45));
        System.out.println(integerStringTreeMap.subMap(15, false, 45, true));

        System.out.println(integerStringTreeMap.tailMap(15));
        System.out.println(integerStringTreeMap.tailMap(15, false));
    }
}

//class MyComparator implements Comparator<String>{
//
//    @Override
//    public int compare(String o1, String o2) {
//        return o2.compareTo(o1);
//    }
//}