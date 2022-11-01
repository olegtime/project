package org.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import org.itmo.lab2.moves.ferroseed.*;

public class Ferroseed extends Pokemon {
    public Ferroseed(String name, int level){
        super(name, level);
        super.setType(Type.GRASS, Type.STEEL);
        super.setStats(44, 50, 91, 24, 86, 10);

        MirrorShot mirrorShot = new MirrorShot(Type.STEEL, 65, 85);
        PinMissile pinMissile = new PinMissile(Type.BUG, 25, 95);
        Harden harden = new Harden(Type.NORMAL, 0, 0);

        super.setMove(mirrorShot, pinMissile, harden);
    }
}

