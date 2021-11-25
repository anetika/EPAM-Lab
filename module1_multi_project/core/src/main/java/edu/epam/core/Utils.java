package edu.epam.core;

import edu.epam.utils.StringUtils;

public class Utils {
    public boolean isAllPositiveNumbers(String... strings) {
        for (var str: strings) {
            if (!StringUtils.isPositiveNumber(str)) {
                return false;
            }
        }
        return true;
    }
}
