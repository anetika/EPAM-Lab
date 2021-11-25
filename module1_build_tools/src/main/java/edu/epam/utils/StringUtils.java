package edu.epam.utils;

import static org.apache.commons.lang3.math.NumberUtils.isCreatable;

public class StringUtils {
    private StringUtils() {}

    public static boolean isPositiveNumber(String str){
        if (isCreatable(str)) {
            return !str.startsWith("-");
        }
        return false;
    }
}

