package lesson7.homework.vazifa_7_4;

public final class SalariedEmployee extends Person implements Office{

    private double weeklyPay;

    public void setWage(double setWage){
        this.weeklyPay = weeklyPay;
    }

    public void moveOffice(){
        System.out.println("Office");
    }

    public double getWeeklyPay() {
        return weeklyPay;
    }

    @Override
    public void setNumber() {

    }

    @Override
    public void getNumber() {

    }

    @Override
    public void setOccupant() {

    }

    @Override
    public void getOccupant() {

    }
}
