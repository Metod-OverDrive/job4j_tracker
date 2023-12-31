package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        String result = "";
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            Customer customer = queue.poll();
            if (count == 1) {
                result = customer.name();
                break;
            } else {
                count--;
            }
        }
        return result;
    }

    public String getFirstUpsetCustomer() {
        String result = "";
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            Customer customer = queue.poll();
            if (count == 0) {
                result = customer.name();
                break;
            } else {
                count--;
            }
        }
        return result;
    }
}