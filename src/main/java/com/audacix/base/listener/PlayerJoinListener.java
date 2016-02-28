package com.audacix.base.listener;

import com.audacix.base.Base;
import com.audacix.base.title.Title;
import com.audacix.base.utils.sound.SoundUtils;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * @author Javi
 */
public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(final PlayerJoinEvent event) {
        Title t = new Title("&9&lAUDACIX", "&7&lThe first Minecraft futuristic MMORPG", 20, 50, 20);
        t.setTimingsToTicks();
        t.send(event.getPlayer());

        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("Base"), new Runnable() {
            @Override
            public void run() {
                String song = "WELCOME";
                Base.getA().log("SONG", "Playing song " + song + " to " + event.getPlayer().getName() + "...");
                new SoundUtils(song).search().play(event.getPlayer());
            }
        }, 12L);

    }
}
