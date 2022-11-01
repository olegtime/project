package org.itmo.lab2.moves.mew;

import ru.ifmo.se.pokemon.*;

public class SludgeWave extends SpecialMove {
    public SludgeWave(Type type, double pow, double acc){
        super(type, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if (Math.random() <= 0.1){
            Effect.poison(p);
        }
    }

    @Override
    protected String describe(){
        return "применяет специальную атаку: Sludge Wave";
    }
}
