package ifl1;

import abiturklassen.Queue;

public class Shop {
    private String name;
    private double balance;

    public Shop(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
