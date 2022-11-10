package Homework.inheritance;

public class Main {
    public static void main(String[] args) {

        Books book = new Books();
        book.title="Shaytanat";
        book.autor="Tohir Malik";
        book.price=50000;
        book.numberOfPages=650;
        book.sale=10;

        EBooks book1 = new EBooks();
        book1.title="Ibtido";
        book1.autor="Den Braun";
        book1.price=45000;
        book1.numberOfPages=420;
        book1.sale=10;

        book1.downloadSite="Asaxiy.uz";
        book1.volume= 15;

        PaperBook book2 = new PaperBook();
        book2.title="Diqqat";
        book2.autor="Kil Nyuport";
        book2.price=20000;
        book2.numberOfPages=230;
        book2.sale=10;

        book2.weight = 2;
        book2.deliveryTime=5;

        book.calculatePrice();
        book.calculateCustoms();
        book1.calculatePrice();
        book1.calculateCustoms();
        book1.printTitle();
        book2.calculatePrice();
        book2.calculateCustoms();



    }
}
