package lesson7.homework.vazifa_7_4;

public final class HourlyEmployee extends Person {

    private double hourlyRate;
    private long jobID;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public long getJobID() {
        return jobID;
    }

    public void setJobID(long jobID) {
        this.jobID = jobID;
    }
}
