package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void when5ThenFriday() {
        String out = new SwitchWeek().nameOfDay(5);
        String expexted = "Пятница";
        Assert.assertEquals(expexted, out);
    }

    @Test
    public void when9ThenError() {
        String out = new SwitchWeek().nameOfDay(9);
        String expexted = "Ошибка";
        Assert.assertEquals(expexted, out);
    }
}