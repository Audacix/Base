package com.audacix.base.utils;

import com.audacix.base.utils.string.StringUtils;

/**
 * @author Javi
 */
public class Utility {

    public Utility() {}

    public Utility getUtilityPackage(String s) {
        if (s.equals("string")) {
            return new StringUtils();
        }
        return null;
    }
}
