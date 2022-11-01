package org.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import org.itmo.lab2.moves.ferrothorn.*;

public class Ferrothorn extends Pokemon {
    public Ferrothorn(String name, int level){
        super(name, level);
        super.setType(Type.GRASS, Type.STEEL);
        super.setStats(74, 94, 131, 54, 116, 20);

        MirrorShot mirrorShot = new MirrorShot(Type.STEEL, 65, 85);
        PinMissile pinMissile = new PinMissile(Type.BUG, 25, 95);
        Harden harden = new Harden(Type.NORMAL, 0, 0);
        ShadowClaw shadowClaw = new ShadowClaw(Type.GHOST, 70, 100);

        super.setMove(mirrorShot, pinMissile, harden, shadowClaw);
    }
}
