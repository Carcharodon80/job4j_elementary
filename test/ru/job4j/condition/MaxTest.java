package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To2Then() {
        int result = Max.max(5, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax1To1Then1() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenMax1To2To19Then19() {
        int result = Max.max(1, 1, 19);
        assertThat(result, is(19));
    }

    @Test
    public void whenMax2To3To23To35Then35() {
        int result = Max.max(2, 3, 23, 35);
        assertThat(result, is(35));
    }
}