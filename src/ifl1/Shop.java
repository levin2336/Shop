package ifl1;

import java.util.Queue;

public class Shop {
    private String name;
    private double balance;
    private Queue<Customer> customerQueue;

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
