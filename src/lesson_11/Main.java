package lesson_11;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("====HashSet====");
        HashSet<Integer> integerHashSet = new HashSet<>();  // default constructor
        integerHashSet.add(1);
        integerHashSet.add(8);
        integerHashSet.add(3);
        integerHashSet.add(15);
        integerHashSet.add(126);
        integerHashSet.add(131);
        System.out.println(integerHashSet);

        HashSet<Integer> integers = new HashSet<>(integerHashSet);
        integers.add(500);
        System.out.println(integers);

        HashSet<Integer> set = new HashSet<>(100);
        System.out.println(integers.remove(131));
        System.out.println("After remove");
        System.out.println(integers);

        System.out.println(integers.contains(500));

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();

        System.out.println("====LinkedHashSet====");
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(8);
        linkedHashSet.add(3);
        linkedHashSet.add(15);
        linkedHashSet.add(126);
        linkedHashSet.add(131);
        System.out.println(linkedHashSet);

        System.out.println("====TreeSet====");
        TreeSet<Integer> treeSet = new TreeSet<>(linkedHashSet);
        System.out.println(treeSet);

        User user1 = new User("root1", "123", "root1@gmail.com");
        User user2 = new User("root2", "456", "root2@gmail.com");
        User user3 = new User("root3", "789", "root3@gmail.com");
        User user4 = new User("root4", "1122", "root4@gmail.com");
        User user5 = new User("root5", "3344", "root5@gmail.com");
        HashSet<User> usersHashSet = new HashSet<>();
        usersHashSet.add(user1);
        usersHashSet.add(user2);
        usersHashSet.add(user3);
        usersHashSet.add(user4);
        usersHashSet.add(user5);
        System.out.println("usersHashSet: ");
        usersHashSet.forEach(user -> System.out.println(user));

        LinkedHashSet<User> userLinkedHashSet = new LinkedHashSet<>();
        userLinkedHashSet.add(user1);
        userLinkedHashSet.add(user2);
        userLinkedHashSet.add(user3);
        userLinkedHashSet.add(user4);
        userLinkedHashSet.add(user5);
        System.out.println("usersLinkedHashSet: ");
        userLinkedHashSet.forEach(user -> System.out.println(user));

        System.out.println("integerTreeSet");
        TreeSet<Integer> integerTreeSet = new TreeSet<>(integers);
        System.out.println(integerTreeSet);

//        TreeSet<User> userTreeSet = new TreeSet<>();
//        userTreeSet.add(user1);
//        userTreeSet.add(user2);
//        userTreeSet.add(user3);
//        userTreeSet.add(user4);
//        userTreeSet.add(user5);
//        System.out.println("usersTreeSet: ");
//        userTreeSet.forEach(user -> System.out.println(user));

        TreeSet<User> userTreeSet1 = new TreeSet<>(Comparator.comparing(User::getEmail));
        userTreeSet1.add(user1);
        userTreeSet1.add(user2);
        userTreeSet1.add(user3);
        userTreeSet1.add(user4);
        userTreeSet1.add(user5);
        System.out.println("email bo'yicha usersTreeSet: ");
        userTreeSet1.forEach(user -> System.out.println(user));

        System.out.println("first=>" + userTreeSet1.first());
        System.out.println("first=>" + userTreeSet1.last());
        System.out.println("====TreeSet====");
        System.out.println(treeSet);
        System.out.println(integerTreeSet.subSet(3, false, 15, false));
        System.out.println(integerTreeSet.headSet(20));
        System.out.println(integerTreeSet.tailSet(15));

    }
}



