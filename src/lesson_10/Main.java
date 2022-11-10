package lesson_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Collection collection = new ArrayList();
        collection.add("Hello");
        collection.add(true);
        collection.add(5);

        System.out.println(collection);

        Collection collection2 = new ArrayList();
        collection2.addAll(collection);
        collection2.add("two");
        System.out.println(collection2);

//        collection.clear();
//        System.out.println("After clear");
//        System.out.println(collection);

        if( collection2.contains("two")){
            System.out.println("Bor");
        }
        else{
            System.out.println("Yo'q");
        }

        if(collection.isEmpty()){
            System.out.println("collection da element yo'q");
        }
        else{
            System.out.println("collection da element bor");
        }

        System.out.println("=====remove metodi=====");
        System.out.println(collection2.remove("two"));
        System.out.println(collection2);

//        collection2.add("new element");
//        System.out.println("collection= " + collection);
//        System.out.println("collection2 " + collection2);
//        collection2.removeAll(collection);
//        System.out.println("collection2= " + collection2);

        collection2.add("new element");
        System.out.println("collection= " + collection);
        System.out.println("collection2 " + collection2);
        collection2.retainAll(collection);
        System.out.println("collection2= " + collection2);

        System.out.println("Size of collection2: " + collection2.size());

        Object[] objects = collection2.toArray();
        System.out.println(Arrays.toString(objects));

        System.out.println("======Iterator====");
        Iterator iterator = collection2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
