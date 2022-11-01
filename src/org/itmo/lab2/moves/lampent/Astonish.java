package org.itmo.lab2.moves.lampent;

import ru.ifmo.se.pokemon.*;

public class Astonish extends PhysicalMove {
    public Astonish(Type type, double pow, double acc){
        super(type, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3){
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe(){
        return "применяет физическую атаку: Astonish";
    }
}
