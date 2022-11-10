package lesson7.homework.vazifa_7_9;

public abstract class Employee implements TaxablePayee{

    private String name;
    private int ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public int pay() {
        return 0;
    }

    @Override
    public String account() {
        return null;
    }

    @Override
    public int taxable() {
        return 0;
    }

    @Override
    public double countTaxable() {
        return 0;
    }
}
