package Homework;

public class Account {

    private String name;
    private String surname;
    private int account;
    private int balance;

    public Account() {
    }

    public Account(String name, String surname, int account, int balance) {
        this.name = name;
        this.surname = surname;
        this.account = account;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
