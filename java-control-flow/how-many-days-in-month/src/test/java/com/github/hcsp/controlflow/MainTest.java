package com.github.hcsp.controlflow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() {
        int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Assertions.assertEquals("非法输入", Main.howManyDaysInMonth(-1));
        Assertions.assertEquals("非法输入", Main.howManyDaysInMonth(13));
        for (int i = 1; i <= 12; ++i) {
            Assertions.assertEquals(
                    String.format("%d月有%d天", i, days[i - 1]), Main.howManyDaysInMonth(i));
        }
    }
}
