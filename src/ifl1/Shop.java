package ifl1;

import abiturklassen.Queue;

public class Shop {
    private String name;
    private double balance;
    private CashDesk[] desks;


    public Shop(String name, double balance, int numberOfDesks) {
        this.name = name;
        this.balance = balance;
        this.desks =  new CashDesk[numberOfDesks];
        for (int i = 0; i < desks.length; i++){
            desks[i] = new CashDesk();
        }
    }

    public Shop(String name) {
        this.name = name;
        this.balance = 0;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
