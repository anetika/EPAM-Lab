package edu.epam.utils;

import static org.apache.commons.lang3.math.NumberUtils.isCreatable;

public class StringUtils {
    public boolean isPositiveNumber(String str){
        if (isCreatable(str)) {
            if (!str.startsWith("-")) {
                return true;
            }
        }
        return false;
    }
}

