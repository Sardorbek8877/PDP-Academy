package lesson_10.list;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List list1 = new ArrayList(); // init capacity 10;
        List list2 = new ArrayList(100);
        List list3 = new ArrayList(list2);

        list1.add("Hello");
        list1.add(5);

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(2,8);
        System.out.println(list);
        int element = list.get(3);
        System.out.println(element);

        System.out.println("=====Iterating by Iterator=====");
        Iterator<Integer> integerIterator = list.iterator();
        while(integerIterator.hasNext()){
            System.out.print(integerIterator.next() + "\t");
        }

        System.out.println();
        System.out.println("=====Iterating by fori=====");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }

        System.out.println();
        System.out.println("=====Iterating by foreach=====");
        for (Integer integer : list) {
            System.out.print(integer + "\t");
        }

        System.out.println();
        System.out.println("=====Iterating by Collection foreach=====");
        list.forEach(integer -> System.out.print(integer + "\t"));

        System.out.println();
        System.out.println("=====Lambda Expression orqali listni tartiblash=====");
        list.sort((o1, o2) -> o1-o2); //listni o'sish tartibida tartiblash
        list.sort((o1, o2) -> o2-o1);  // listni kamayish tartibida tartiblash
        System.out.println(list);

        System.out.println("=====Comparator.comparing orqali listni tartiblash=====");
        list.sort(Comparator.comparing(Integer::intValue));
        System.out.println(list);

        System.out.println("=====Comparator class orqali listni tartiblash=====");
        ListComparator listComparator = new ListComparator();
        list.sort(listComparator);
        System.out.println(list);

        System.out.println("====LInked list======");
        LinkedList<Integer> linkedList = new LinkedList<>(list);
        linkedList.addFirst(50);
        linkedList.addLast(100);
        System.out.println(linkedList);

        Iterator<Integer> iterator = linkedList.descendingIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }

        System.out.println();
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}

class ListComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
