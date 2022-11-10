package lesson_10.homework.vazifa_10_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("====List yaratish va unga 10 ta ism qo'shish=====");
        List<String> ismlar = new ArrayList();
        ismlar.add("Ali");
        ismlar.add("Vali");
        ismlar.add("Murod");
        ismlar.add("Xasan");
        ismlar.add("Xusan");
        ismlar.add("Komil");
        ismlar.add("Temur");
        ismlar.add("Jasur");
        ismlar.add("Oybek");
        ismlar.add("Sarvar");

        System.out.println("===List elementlarini Iterator orqali ekranga chiqarish====");
        Iterator<String> stringIterator = ismlar.iterator();
        while(stringIterator.hasNext()){
            System.out.println(stringIterator.next() + "\t");
        }

        ismlar.add("Xolmat");  // List oxiriga Xolmat elementini kiritish

        ismlar.add(0,"Sardor");  // Birinchi elementiga ism kiritish

        ismlar.set(2, "Safarov"); // 2 indexdagi elementni familiya bilan almashtirish

        System.out.println("====Listni Arrayga o'girish va chop etish====");
        String[] arrayIsmlar = new String[ismlar.size()];
        ismlar.toArray(arrayIsmlar);
        for(int i=0; i<arrayIsmlar.length; i++){
            System.out.print(arrayIsmlar[i] + "\t");
        }

        System.out.println();
        System.out.println("====Listning ichidan ism va familiyani element qiymati bo'yicha o'chirish====");
        ismlar.remove("Sardor");
        ismlar.remove("Safarov");
        for (int i = 0; i < ismlar.size(); i++) {
            System.out.print(ismlar.get(i) + "\t");
        }
    }
}
