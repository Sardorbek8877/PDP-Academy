package Homework.vazifa_4_4;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        DomesticMammals cat1 = new Cat();   //DomesticMammals classi orqali obyekt olish
        cat.numberOfLegs = 4;               //Animal classi attributi
        cat.color = "Jigarrang";            //Animal classi attributi
        cat.name = "Kesha";                 //DomesticAnimal classi attributi
        cat.food = "Qadoqlangan mushuklar ovqati";  //DomesticAnimal classi attributi
        cat.ability = "Sichqon ovlash";     //DomesticMammals classi attributi
        cat.colorOfWool = "Yunggi yo'q";    //DomesticMammals classi attributi
        cat.typeOfCat = "Sfinks";           //Cat classi attributi
        System.out.println("=====Mushukning ma'lumotlari=====");
        cat.getNumberOfLegs();              //Animal classi metodi
        cat.getColor();                     //Animal classi metodi
        cat.getName();                      //DomesticAnimal classi metodi
        cat.getFood();                      //DomesticAnimal classi metodi

        Duck duck = new Duck();
        DomesticBird duck1 = new Duck();      //DomesticBird classi orqali obyekt olish
        duck.numberOfLegs = 2;               //Animal classi attributi
        duck.color = "Qora";                 //Animal classi attributi
        duck.name = "No name";               //DomesticAnimal classi attributi
        duck.food = "Donli ekinlar";         //DomesticAnimal classi attributi
        duck.fly = "Ucha olmaydi";           //DomesticBird classi attributi
        duck.ability = "Tuxum qo'yish";      //DomesticBird classi attributi
        duck.swim = "Suza oladi";            //Duck classi attributi
        System.out.println("=====O'rdakning ma'lumotlari=====");
        duck.getNumberOfLegs();              //Animal classi metodi
        duck.getColor();                     //Animal classi metodi
        duck.getName();                      //DomesticAnimal classi metodi
        duck.getFood();                      //DomesticAnimal classi metodi

        Lion lion = new Lion();
        WildMammals lion1 = new Lion();      //WildMammals classi orqali obyekt olish
        lion.numberOfLegs = 4;               //Animal classi attributi
        lion.color = "Och jigarrang";        //Animal classi attributi
        lion.food = "Go'sht";                //WildAnimal classi attributi
        lion.residence = "Savanna";          //WildAnimal classi attributi
        lion.ability = "Hayvon ovlash";      //WildMammals classi attributi
        lion.weight = 150;                   //Lion classi attributi
        System.out.println("=====Sherning ma'lumotlari=====");
        lion.getNumberOfLegs();              //Animal classi metodi
        lion.getColor();                     //Animal classi metodi
        lion.getResidence();                 //WildAnimal classi metodi
        lion.getFood();                      //WildAnimal classi metodi

        Eagle eagle = new Eagle();
        WildBird eagle1 = new Eagle();        //WildBird classi orqali obyekt olish
        eagle.numberOfLegs = 2;               //Animal classi attributi
        eagle.color = "Chipor";               //Animal classi attributi
        eagle.food = "Go'sht";                //WildAnimal classi attributi
        eagle.residence = "Tog'";            //WildAnimal classi attributi
        eagle.fly = "Ucha oladi";            //WildBird classi attributi
        eagle.weight = 30;                   //Eagle classi attributi
        System.out.println("=====Burgutning ma'lumotlari=====");
        eagle.getNumberOfLegs();              //Animal classi metodi
        eagle.getColor();                     //Animal classi metodi
        eagle.getResidence();                 //WildAnimal classi metodi
        eagle.getFood();                      //WildAnimal classi metodi

        Straus straus = new Straus();
        WildBird straus1 = new Straus();
        straus.numberOfLegs = 2;                    //Animal classi attributi
        straus.color = "Och kulrang";               //Animal classi attributi
        straus.food = "O't o'lanlar";               //WildAnimal classi attributi
        straus.residence = "Cho'l adirliklar";      //WildAnimal classi attributi
        straus.fly = "Ucha olmaydi";                //WildBird classi attributi
        straus.weight = 80;                         //Straus classi attributi
        System.out.println("=====Strausning ma'lumotlari=====");
        straus.getNumberOfLegs();                     //Animal classi metodi
        straus.getColor();                            //Animal classi metodi
        straus.getResidence();                        //WildAnimal classi metodi
        straus.getFood();                             //WildAnimal classi metodi
        straus.getWeight();
    }
}
