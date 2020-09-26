package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when5509Then6And4() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 0;
        int y2 = 9;
        double expected = 6.4;
        double out = new Point(5, 5).distance(new Point(0, 9));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when0009Then9() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 9;
        double expected = 9;
        double out = new Point(0, 0).distance(new Point(0, 9));
        Assert.assertEquals(expected, out, 0);
    }
}