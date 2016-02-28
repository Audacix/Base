package com.audacix.base;

import com.audacix.base.admin.Admin;
import com.audacix.base.admin.OperationalAdmin;
import com.audacix.base.listener.PlayerJoinListener;
import com.audacix.base.title.Title;
import com.audacix.base.utils.Utility;
import com.audacix.base.utils.sound.SoundUtils;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Javi
 */
public class Base extends JavaPlugin {

    public Base () {}

    @Getter String pluginname = "Base";
    @Getter String version = "0.1-ALPHA";
    @Getter Utility utilities = new Utility();
    @Getter Title emptyTitle = new Title("");
    @Getter public static OperationalAdmin a;

    public void onEnable() {
        //Test admin

        a = new Admin().get("th7536kcoxu8uhpfme7tx6cigw9zma");
        a.log("[INIT]", "Admin has started and is properly working.");

        registerListeners();

        SoundUtils.loadSoundClasses();
    }

    private void registerListeners() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerJoinListener(), this);
    }
}
