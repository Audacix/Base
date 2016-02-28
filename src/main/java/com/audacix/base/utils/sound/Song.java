package com.audacix.base.utils.sound;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

import java.util.ArrayList;

/**
 * @author Javi
 */
public class Song {

    FullSound[] sounds;
    public Song (FullSound[] sounds) {
        this.sounds = sounds;
    }

    public void play(Player p) {
        try {
            for (FullSound s : sounds) {
                p.playSound(p.getLocation(), s.getS(), s.getA(), s.getB());
                Thread.sleep(s.getDelayafter());
            }
        } catch (InterruptedException ex) {
            //ignore
        }

    }
}
