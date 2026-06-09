package Oop;

/*
 * Classe responsável pela conta bancária
 */
public class Account {

    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        balance += value;
    }

    public boolean withdraw(double value) {
        if (value > balance) {
            return false;
        }
        balance -= value;
        return true;
    }
}