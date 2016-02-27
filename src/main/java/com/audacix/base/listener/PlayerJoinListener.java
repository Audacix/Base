package com.audacix.base.listener;

import com.audacix.base.title.Title;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * @author Javi
 */
public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Title t = new Title("&9&lAUDACIX", "&7&lThe first Minecraft futuristic MMORPG", 20, 50, 20);
        t.setTimingsToTicks();
        t.send(event.getPlayer());


    }
}
