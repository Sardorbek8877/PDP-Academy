package lesson7.homework.vazifa_7_5;

public class Pitcher extends BaseballPlayer{

    private double innings;
    private int earnedRuns;

    public double earnedRunAverage(){
        return innings / earnedRuns;
    }

    public double getInnings() {
        return innings;
    }

    public void setInnings(double innings) {
        this.innings = innings;
    }

    public int getEarnedRuns() {
        return earnedRuns;
    }

    public void setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
    }
}
