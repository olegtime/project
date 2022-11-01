package org.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import org.itmo.lab2.moves.lampent.*;

public class Lampent extends Pokemon {
    public Lampent(String name, int level){
        super(name, level);
        super.setType(Type.GHOST, Type.FIRE);
        super.setStats(60, 40, 60, 95, 60, 55);

        ShadowBall shadowBall = new ShadowBall(Type.GHOST, 80, 100);
        Overheat overheat = new Overheat(Type.FIRE, 130, 90);
        Astonish astonish = new Astonish(Type.GHOST, 30, 100);

        super.setMove(shadowBall, overheat, astonish);
    }
}
