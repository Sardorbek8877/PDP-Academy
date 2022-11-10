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
            if(ink==0){
                System.out.println("Ruchkada siyoh qolmagan, sterjenni almashtiring!");
            }
            else{
                char[] letter = word.toCharArray(); // berilgan String turdagi tekstni char turidagi massivga o'tqazamiz
                int countLetter = 0; //siyohning qancha kerak bo'lishini hisoblash uchun birlik qiymat
                for(int i=0; i<letter.length; i++){
                    if(letter[i]==' '){
                        countLetter+=0;
                    }
                    else{
                        if(Character.isUpperCase(letter[i])){
                            countLetter+=2;
                        }
                        else{
                            countLetter++;
                        }
                    }
                }

                if( ink > countLetter*inkConsumption){
                    System.out.println(word);
                    ink = ink - countLetter*inkConsumption; // siyohning sarflanishi
                }
                else{
                    int i = 0;
                    double numberLetter = ink/inkConsumption; // siyohning nechta harfga yetishi
                    while( i < numberLetter ){
                        if(letter[i]==' '){
                            System.out.print(letter[i]);
                            i++;
                            numberLetter++;
                        }
                        else{
                            if(Character.isUpperCase(letter[i])){
                                System.out.print(letter[i]);
                                i++;
                                numberLetter --; // Katta harf yozganda siyoh sarfi 2 barobar oshadi va 1 ta kamroq harfga yetadi
                            }
                            else{
                                System.out.print(letter[i]);
                                i++;
                            }
                        }

                    }
                    ink = 0;
                    System.out.println("\nRuchkada siyoh miqdori 0 %, sterjenni almashtiring!");
                }
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
