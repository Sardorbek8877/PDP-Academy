package lesson7.homework.vazifa_7_5;

public class BaseballPlayer extends Player{

    private int atBats;
    private int hits;

    public double battingAverage(){
        return atBats / hits;
    }

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }
}
