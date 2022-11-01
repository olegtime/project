package org.itmo.lab2.moves.ferroseed;

import ru.ifmo.se.pokemon.*;

public class Harden extends StatusMove {
    public Harden(Type type, double pow, double acc){
        super(type, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        System.out.println(p + " получает 1 защиты.");
        Effect e = new Effect().stat(Stat.DEFENSE, 1);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "применяет статусную атаку: Harden";
    }
}
