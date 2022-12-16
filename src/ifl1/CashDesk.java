package ifl1;

import abiturklassen.Queue;


public class CashDesk {
    private Queue<Customer> queue;

    public CashDesk(Queue<Customer> queue) {
        this.queue = queue;
    }

    public Queue<Customer> getQueue() {
        return queue;
    }
}
