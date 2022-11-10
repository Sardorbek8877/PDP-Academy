package lesson_10.homework.vazifa_10_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Car klassidan Object olish va elementlarni yaratish
        Car car1 = new Car("Qora","nexia", "777");
        Car car2 = new Car("Oq","damas", "111");
        Car car3 = new Car("Qizil","matiz", "2222");
        Car  car4= new Car("Oq","malibu", "333");
        Car  car5= new Car("Qora","corolla", "444");
        Car  car6= new Car("Sariq","gentra", "555");
        Car  car7= new Car("Qora","impala", "666");
        Car  car8= new Car("Qizil","taycan", "777");
        Car  car9= new Car("Ko'k","urus", "888");
        Car  car10= new Car("Yashil","chiron", "999");

        // cars listini yaratish va unga elementlar qo'shish
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

        //Index yordamida cars elementlarini ekranga chiqarish
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).toString()+ "\t");
        }
        System.out.println();

        //Random metodi yordamida element tanlab olish
        Random rand = new Random();
        int n = rand.nextInt(10);
        System.out.println(cars.get(n).toString());

        //cars1 Listini yaratish va cars elementlarini joylashtirish
        List<Car> cars1 = new ArrayList<>(5);

        for (int i=2; i<7; i++){
            cars1.add(cars.get(i));
        }

        System.out.println(cars1.get(1).toString());

        // cars ArrayList ini saralash


        //cars listidan cars1 listida bor bo'lgan elementlarni o'chirish
        for (int i=0; i<cars.size(); i++){
            for( int j=0; j<cars1.size(); j++){
                if(cars.get(i) == cars1.get(j)){
                    cars.remove(i);
                }
            }
        }

        // cars listidan cars1 listida yo'q bo'lgan elementlarni o'chirmiz
        for (int i=0; i<cars1.size(); i++){
            for( int j=0; j<cars.size(); j++){
                if(cars.get(i) != cars1.get(j)){
                    cars.remove(i);
                }
            }
        }

    }

    public static Object getRandomElement(List list){
        Random random = new Random();
        int n= random.nextInt(list.size());
        return list.get(n);
    }


}
