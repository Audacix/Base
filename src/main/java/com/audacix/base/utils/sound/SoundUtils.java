package com.audacix.base.utils.sound;

import com.audacix.base.utils.Utility;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import java.util.*;

/**
 * @author Javi
 */
public class SoundUtils extends Utility {

    String songname;
    private static Map<String, Song> songs = new HashMap<>();

    public SoundUtils(String songname) {
        this.songname = songname;
    }

    public Song search() {
        if (songs.containsKey(songname.toUpperCase())) {
            return songs.get(songname.toUpperCase());
        }
        return null;
    }


    //
    public static void loadSoundClasses() {
        //WELCOME
        songs.put("WELCOME",
                new Song(
                        new FullSound[]{
                                new FullSound(Sound.NOTE_BASS, 2.0F, 2.0F, 350),
                                new FullSound(Sound.NOTE_BASS_DRUM, 3.0F, 3.0F, 350),
                                new FullSound(Sound.NOTE_BASS_GUITAR, 2.0F, 3.0F, 350)
                        }
                )
        );
    }


}
