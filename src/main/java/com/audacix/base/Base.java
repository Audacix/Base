package com.audacix.base;

import com.audacix.base.admin.Admin;
import com.audacix.base.admin.OperationalAdmin;
import com.audacix.base.listener.PlayerJoinListener;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Javi
 */
public class Base extends JavaPlugin {

    Plugin p;
    public Base (Plugin plugin) {
        this.p = plugin;
    }

    @Getter String pluginname = "Base";
    @Getter String version = "0.1-ALPHA";


    public void onEnable() {
        //Test admin

        OperationalAdmin a = new Admin().get("th7536kcoxu8uhpfme7tx6cigw9zma");
        a.log("[INIT]", "Admin has started and is properly working.");
    }

    private void registerListeners() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerJoinListener(), this);
    }
}
