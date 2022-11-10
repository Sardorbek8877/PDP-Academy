package lesson_12.homework.vazifa_12_3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> fruitMap = new HashMap<>();

        Fruit meva1 = new Fruit("Anor", "Quva", 0);
        Fruit meva2 = new Fruit("Anor", "Tuya tish", 0);
        Fruit meva3 = new Fruit("Anor", "Surxon", 0);
        Fruit meva4 = new Fruit("Olma", "Besh yulduz", 0);
        Fruit meva5 = new Fruit("Olma", "Golden", 0);
        Fruit meva6 = new Fruit("Olma", "Qirmizi", 0);
        Fruit meva7 = new Fruit("Olma", "Semerenka", 0);
        Fruit meva8 = new Fruit("Banan", "Bananza", 5);
        Fruit meva9 = new Fruit("Banan", "Boshqa", 5);
        Fruit meva10 = new Fruit("Shaftoli", "Tukli", 0);
        Fruit meva11 = new Fruit("Shaftoli", "Tuksiz", 0);
        Fruit meva12 = new Fruit("Kivi", "Import", 0);
        Fruit meva13 = new Fruit("Kivi", "Mahalliy", 0);
        Fruit meva14 = new Fruit("Qulupnay", "Yirik", 0);
        Fruit meva15 = new Fruit("Qulupnay", "Mayda", 0);
        Fruit meva16 = new Fruit("Uzum", "Qora", 0);
        Fruit meva17 = new Fruit("Uzum", "Husayni", 0);
        Fruit meva18 = new Fruit("O'rik", "Surxon", 0);
        Fruit meva19 = new Fruit("O'rik", "Oq", 0);
        Fruit meva20 = new Fruit("O'rik", "Yirik", 0);



        fruitMap.put(meva1.getName()+" "+meva1.getType(), 15000);
        fruitMap.put(meva2.getName()+" "+meva2.getType(), 16000);
        fruitMap.put(meva3.getName()+" "+meva3.getType(), 14000);
        fruitMap.put(meva4.getName()+" "+meva4.getType(), 9000);
        fruitMap.put(meva5.getName()+" "+meva5.getType(), 8000);
        fruitMap.put(meva6.getName()+" "+meva6.getType(), 15000);
        fruitMap.put(meva7.getName()+" "+meva7.getType(), 6000);
        fruitMap.put(meva8.getName()+" "+meva8.getType(), 30000);
        fruitMap.put(meva9.getName()+" "+meva9.getType(), 20000);
        fruitMap.put(meva10.getName()+" "+meva10.getType(), 6000);
        fruitMap.put(meva11.getName()+" "+meva11.getType(), 8000);
        fruitMap.put(meva12.getName()+" "+meva12.getType(), 21000);
        fruitMap.put(meva13.getName()+" "+meva13.getType(), 20000);
        fruitMap.put(meva14.getName()+" "+meva14.getType(), 18000);
        fruitMap.put(meva15.getName()+" "+meva15.getType(), 9000);
        fruitMap.put(meva16.getName()+" "+meva16.getType(), 10000);
        fruitMap.put(meva17.getName()+" "+meva17.getType(), 15000);
        fruitMap.put(meva18.getName()+" "+meva18.getType(), 3000);
        fruitMap.put(meva19.getName()+" "+meva19.getType(), 2000);
        fruitMap.put(meva20.getName()+" "+meva20.getType(), 12000);

        System.out.println("Mapdagi mevalar soni: " + fruitMap.size());

        System.out.println(fruitMap);


        // 2 - vazifa

        System.out.println("A harfi bilan boshlanadigan mevalar");
        fruitMap.forEach((fruit, integer) ->{
            if (fruit.startsWith("A")){
                System.out.println(fruit + " -> " + integer);
            }
        });

        System.out.println("Narhi 5000 dan katta bo'lgan mevalar ro'yxati");
        fruitMap.forEach((fruit, integer) ->{
            if (integer > 5000){
                System.out.println(fruit + " -> " + integer);
            }
        });

        System.out.println("Barcha mevalarning narhini 10 % ga arzonlashtirish");
        fruitMap.replaceAll((key, value) -> value -= value/10);
        System.out.println(fruitMap);

        System.out.println("Narhi narhi 10000 dan qimmat mevalarni 20% ga arzonlashtirish");
        fruitMap.forEach((fruit, integer) ->{
            if (integer > 10000){
                fruitMap.replaceAll((key, value) -> value -= value/5);
            }
        });

        System.out.println("Narhi narhi 20000 dan qimmat mevalarni 20% ga arzonlashtirish");
        fruitMap.forEach((fruit, integer) ->{
            if (integer > 20000){
                fruitMap.replaceAll((key, value) -> value -= value/100*40);
            }
        });

//        Iterator<String> iterator = hashSet.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next() + "\t");
//        }



        // 3 - vazifa

        System.out.println();
        System.out.println("Iterator yordamida o'rtacha naehni hisoblash");
        Iterator<Integer> iterator = fruitMap.values().iterator();
        int sum = 0;
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        int result = sum / fruitMap.size();
        System.out.println(result);

        System.out.println();
        System.out.println("Barcha olmalarning narhini 5 % ga oshirish");
        fruitMap.forEach((fruit, integer) ->{
            if (fruit.startsWith("Olma")){
                fruitMap.replaceAll((key, value) -> value += value/20);
            }
        });

        System.out.println();
        System.out.println("Barcha mevalarning nomini ekranga chiqarish");
        Set<String> keys = fruitMap.keySet();
        keys.forEach(s -> System.out.print(s + "," + "\t"));

        System.out.println();
        System.out.println("Barcha mevalarning ekranga chiqarish");
        System.out.println(fruitMap);

        System.out.println();
        System.out.println("Barcha mevalarning narxini ekranga chiqarish");
        Collection<Integer> values = fruitMap.values();
        values.forEach(integer -> System.out.print(integer + "\t"));

    }
}
