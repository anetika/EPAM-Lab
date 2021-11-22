package edu.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    @Test
    public void isPositiveNumberTestTrue() {
        String str = "7";
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isPositiveNumber(str));
    }

    @Test
    public void isPositiveNumberTestFalse() {
        String str = "-1";
        StringUtils stringUtils = new StringUtils();
        assertFalse(stringUtils.isPositiveNumber(str));
    }
}
