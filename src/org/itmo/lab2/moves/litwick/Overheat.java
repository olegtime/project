package org.itmo.lab2.moves.litwick;

import ru.ifmo.se.pokemon.*;

public class Overheat extends SpecialMove {
    public Overheat(Type type, double pow, double acc){
        super(type, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        System.out.println(p + " теряет 2 специальной атаки.");
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -2);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "применяет специальную атаку: Overheat";
    }
}
