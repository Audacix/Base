package com.audacix.base.utils;


import com.audacix.base.utils.string.StringUtils;

import java.lang.reflect.Method;

/**
 * @author Javi
 */
public class Utility {

    public Utility() {}

    public Method getUtil(String search) {
        for (Method m : this.getClass().getDeclaredMethods()) {
            if (m.getName().toLowerCase().contains(search.toLowerCase())) return m;
        }
        return null;
    }



}
