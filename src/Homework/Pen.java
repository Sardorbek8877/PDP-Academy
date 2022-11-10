package Homework;

public class Pen {
//    String color;
    private boolean button;
//    double length;
//    double diameter;
    private double ink;
    private String inkColor;
    private double inkConsumption; // siyoh sarfi

    public Pen() {
    }

    public Pen(double ink, String inkColor, double inkConsumption) {
        this.ink = ink;
        this.inkColor = inkColor;
        this.inkConsumption = inkConsumption;
    }

    public Pen(boolean button, double ink, String inkColor, double inkConsumption) {
        this.button = button;
        this.ink = ink;
        this.inkColor = inkColor;
        this.inkConsumption = inkConsumption;
    }

    public void clickButton(){
        button= !button;
    }

    public void write(String word){
        if( button ){
            if( ink >= word.length()*inkConsumption){
                System.out.println(word);
                ink = ink - word.length()*inkConsumption; // siyohning sarflanishi, har bitta harf uchun 1 foiz sarflanadi
            }
            else{
                System.out.println("Ruchkada siyoh qolmagan, sterjenni almashtiring!");
            }
        }
        else{
            System.out.println("Yozishdan oldin tugmani bosing!");
        }
    }

    public void changeSterjen(double ink){
        this.ink = ink;
    }

    public boolean isButton() {
        return button;
    }

    public void setButton(boolean button) {
        this.button = button;
    }

    public double getInk() {
        return ink;
    }

    public void setInk(double ink) {
        if(ink > 0){
            this.ink = ink;
        }

    }

    public String getInkColor() {
        return inkColor;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public double getInkConsumption() {
        return inkConsumption;
    }

    public void setInkConsumption(double inkConsumption) {
        if(inkConsumption > 0){
            this.inkConsumption = inkConsumption;
        }

    }
}
