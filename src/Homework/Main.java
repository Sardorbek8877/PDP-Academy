package Homework;

public class Main {
    public static void main(String[] args) {
//        double w=Math.sqrt(16);
//        System.out.println(w);
//
//        Triangle uch = new Triangle(3,4);
//        System.out.println(uch.perimeter());
//        System.out.println(uch.surface());
//
//        MyClass num = new MyClass(45,50);
//        num.aboutAttributes();
//        System.out.println(num.sumAttributes());
//        System.out.println(num.maxAttribut());
//
//        Date sana = new Date(2020,15,11);
//        sana.showDate();
        //String[] arr= new String[5];
//        String[] arr={"Math", "Informatik", "adsf", "dfgb", "dfgb"};
//        Student student = new Student("Sardorbek", "Safarov", 5864, arr);
//        student.printSubjects();

        String[] autors = {"Aleksandr Dyuma", "Yana kimdir"};
        Book book = new Book();
        book.setName("Graf Monte Kristo");
        book.setAutors(autors);
        book.setPrice(25000);
        book.setIsbn(1234567899999L);
        book.showName();
        book.showAutors();
        System.out.println("\n" + book.getIsbn());
//        String word = "Salom";
//        char[] d = word.toCharArray();
//        System.out.println(d[1]);
//        for(int i=0; i<3; i++){
//            System.out.print(d[i]);
//        }

//        System.out.println("\n=====Pen object=====");
//        Pen pen = new Pen();
//        pen.setInk(100);
//        pen.setInkConsumption(10);
//        System.out.println(pen.getInk());
//        pen.clickButton();
//        pen.write("Hallo World!");
//        System.out.println(pen.getInk());

    }
}
