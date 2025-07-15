// ./utils/src/main/java/com/epam/utils/StringUtils.java
package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return NumberUtils.isParsable(str) && Double.parseDouble(str) > 0;
    }
}
