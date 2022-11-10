package lesson7.homework.vazifa_7_3;

public final class SavingAccount extends BankAccount{

    private Object object;

    public void Save(){
        System.out.println("Hidoni saqlash.");
    }

    @Override
    public double Deposit() {
        return 0;
    }

    @Override
    public double Withdraw() {
        return 0;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
