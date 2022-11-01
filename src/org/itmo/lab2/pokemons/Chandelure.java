package org.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import org.itmo.lab2.moves.chandelure.*;

public class Chandelure extends Pokemon {
    public Chandelure(String name, int level){
        super(name, level);
        super.setType(Type.GHOST, Type.FIRE);
        super.setStats(60, 55, 90, 145, 90, 80);

        ShadowBall shadowBall = new ShadowBall(Type.GHOST, 80, 100);
        Overheat overheat = new Overheat(Type.FIRE, 130, 90);
        Astonish astonish = new Astonish(Type.GHOST, 30, 100);
        DreamEater dreamEater = new DreamEater(Type.PSYCHIC, 100, 100);

        super.setMove(shadowBall, overheat, astonish, dreamEater);
    }
}
