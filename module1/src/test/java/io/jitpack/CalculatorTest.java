package io.jitpack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Assertions.assertEquals(3, new Calculator(1, 2).add());
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(-1, new Calculator(1, 2).subtract());
    }
}
