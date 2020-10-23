package ru.job4j.poly;

public class Bus implements Transport {
    static final double PRICE = 15.75;
    private int passengersInBus;

    @Override
    public void move() {
        System.out.println("Поехали!");
    }

    @Override
    public void passengers(int count) {
        passengersInBus += count;
    }

    @Override
    public double fill(int fuel) {
        return fuel * PRICE;
    }
}
