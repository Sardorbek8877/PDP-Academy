package lesson7.homework.vazifa_7_10.model;

public class Doctor extends Worker{

    private String plan;
    private double workHours;

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }
}
