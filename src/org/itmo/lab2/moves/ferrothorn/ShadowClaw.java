package org.itmo.lab2.moves.ferrothorn;

import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw(Type type, double pow, double acc){
        super(type, pow, acc);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        if (Math.random() <= 0.125){
            System.out.println("Критический удар!");
            return 2.0;
        } else {
            return 1.0;
        }
    }

    @Override
    protected String describe(){
        return "применяет физическую атаку: Shadow Claw";
    }
}
