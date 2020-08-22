package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2then2() {
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K1then6And25() {
        int p = 10;
        int k = 1;
        double out = SqArea.square(p, k);
        double expected = 6.25;
        Assert.assertEquals(expected, out, 0);
    }
}