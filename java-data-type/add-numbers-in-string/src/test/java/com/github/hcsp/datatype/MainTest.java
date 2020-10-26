package com.github.hcsp.datatype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testStringAdd() {
        Assertions.assertEquals("579", Main.add("123", "456"));
        Assertions.assertEquals("0", Main.add("123", "-123"));
        Assertions.assertEquals("123", Main.add("123", null));
        Assertions.assertEquals("0", Main.add(null, null));
    }
}
