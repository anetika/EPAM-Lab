package edu.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    @Test
    public void isPositiveNumberTestTrue() {
        String str = "7";
        assertTrue(StringUtils.isPositiveNumber(str));
    }

    @Test
    public void isPositiveNumberTestFalse() {
        String str = "-1";
        assertFalse(StringUtils.isPositiveNumber(str));
    }
}
