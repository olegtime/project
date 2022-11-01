package org.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import org.itmo.lab2.moves.mew.*;

public class Mew extends Pokemon {
    public Mew(String name, int level){
        super(name, level);
        super.setType(Type.PSYCHIC);
        super.setStats(100, 100, 100, 100, 100, 100);

        XScissor xScissor = new XScissor(Type.BUG, 80, 100);
        SludgeWave sludgeWave = new SludgeWave(Type.POISON, 95, 100);
        ShadowBall shadowBall = new ShadowBall(Type.GHOST, 80, 100);
        WildCharge wildCharge = new WildCharge(Type.ELECTRIC, 90, 100);

        super.setMove(xScissor, sludgeWave, shadowBall, wildCharge);
    }
}

