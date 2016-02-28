package com.audacix.base.admin;

import org.bukkit.Bukkit;

import java.util.logging.Level;

/**
 * @author Javi
 */
public class OperationalAdmin {

    public OperationalAdmin (Admin a) {}

    public void log(String prefix, String message) {
        Bukkit.getLogger().log(Level.INFO, "!! ADMIN EXECUTION !!: " + prefix + " " + message);
    }
}

