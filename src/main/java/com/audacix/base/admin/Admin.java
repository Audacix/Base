package com.audacix.base.admin;


import org.bukkit.Bukkit;

import java.util.Base64;
import java.util.Objects;
import java.util.logging.Level;

/**
 * @author Javi
 */
public class Admin {

    private String encoded = "dGg3NTM2a2NveHU4dWhwZm1lN3R4NmNpZ3c5em1h";

    public Admin () {}

    public OperationalAdmin get(String code) {
        byte[] cod = Base64.getDecoder().decode(encoded);
        if (!Objects.equals(new String(cod), code)) {
            Bukkit.getLogger().log(Level.SEVERE,"BASE: INVALID CODE ENTERED FOR ADMIN OPERATION. RETURNING NULL OPERATIONALADMIN");
            return null;
        }
        return new OperationalAdmin(this);
    }
}
