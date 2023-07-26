package ru.job4j.cast;

public class Road {
    public static void main(String[] args) {
        Vehicle plain = new Plain();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] transports = new Vehicle[]{plain, train, bus};
        for (Vehicle ven: transports) {
            ven.move();
        }
    }
}
