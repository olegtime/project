package org.itmo.lab2.moves.litwick;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove{
    public ShadowBall(Type type, double pow, double acc){
        super(type, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if (Math.random() <= 0.2) {
            System.out.println(p + " теряет 1 специальной защиты.");
            Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
            p.addEffect(e);
        }
    }

    @Override
    protected String describe(){
        return "применяет специальную атаку: Shadow Ball";
    }
}

