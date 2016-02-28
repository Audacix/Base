package com.audacix.base.utils.sound;

import lombok.Getter;
import org.bukkit.Sound;

/**
 * @author Javi
 */
public class FullSound {

    @Getter Sound s;
    @Getter float a;
    @Getter float b;
    @Getter int delayafter;

    public FullSound(Sound s, float a, float b, int delayafter) {
        this.s = s;
        this.a = a;
        this.b = b;
        this.delayafter = delayafter;
    }

    /*public FullSound(Sound s, float a, float b, int delayafter) {
        this.s = s;
        this.a = a;
        this.b = b;
        this.delayafter = delayafter;
    }*/
}
