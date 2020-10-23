package ru.job4j.poly;

public interface Transport {
    void move();

    void passengers(int count);

    double fill(int fuel);
}
