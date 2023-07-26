package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус в пути.");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println(passengers + " в автобусе.");
    }

    @Override
    public int refuel(int volume) {
        return volume / 10;
    }
}
