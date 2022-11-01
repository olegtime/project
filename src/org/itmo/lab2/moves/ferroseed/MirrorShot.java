package org.itmo.lab2.moves.ferroseed;

import ru.ifmo.se.pokemon.*;

public class MirrorShot extends SpecialMove {
    public MirrorShot(Type type, double pow, double acc){
        super(type, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if (Math.random() <= 0.3) {
            System.out.println(p + " теряет 1 точности.");
            Effect e = new Effect().stat(Stat.ACCURACY, -1);
            p.addEffect(e);
        }
    }

    @Override
    protected String describe(){
        return "применяет специальную атаку: Mirror Shot";
    }
}
