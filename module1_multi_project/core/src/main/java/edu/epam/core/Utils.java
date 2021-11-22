package edu.epam.core;

import edu.epam.utils.StringUtils;

public class Utils {
    public boolean isAllPositiveNumbers(String... strings) {
        boolean flag = true;
        StringUtils stringUtils = new StringUtils();
        for (var str: strings) {
            if (!stringUtils.isPositiveNumber(str)) {
                flag = false;
            }
        }
        return flag;
    }
}
