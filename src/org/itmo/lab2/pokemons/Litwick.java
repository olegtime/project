package org.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import org.itmo.lab2.moves.litwick.*;

public class Litwick extends Pokemon {
    public Litwick(String name, int level){
        super(name, level);
        super.setType(Type.GHOST, Type.FIRE);
        super.setStats(50, 30, 55, 65, 55, 20);

        ShadowBall shadowBall = new ShadowBall(Type.GHOST, 80, 100);
        Overheat overheat = new Overheat(Type.FIRE, 130, 90);

        super.setMove(shadowBall, overheat);
    }
}
