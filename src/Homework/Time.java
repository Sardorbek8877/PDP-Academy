package Homework;

public class Time {

    private int hour;
    private int minute;
    private int secund;

    public Time() {
    }

    public Time(int hour, int minute, int secund) {
        this.hour = hour;
        this.minute = minute;
        this.secund = secund;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecund() {
        return secund;
    }

    public void setSecund(int secund) {
        this.secund = secund;
    }

    public void showTime(){
        System.out.println(format(hour) + ":" + format(minute) + ":" + format(secund));
    }

    String format(int value){
        String result;
        if(value<10){
            result="0" + value;
        }
        else{
            result = "" + value;
        }
        return result;
    }
}
