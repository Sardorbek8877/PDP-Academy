package Homework;

public class Date {
    int year;
    int month;
    int day;
    Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    void showDate(){
        System.out.println(sana(day) + "." + sana(month) + "." + year);
    }
    String sana(int value){
        String result;
        if(value<10){
            result =  "0"+value;
        }else{
            result = "" + value;
        }
        return result;
    }
}
