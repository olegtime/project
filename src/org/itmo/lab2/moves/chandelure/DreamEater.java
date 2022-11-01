package org.itmo.lab2.moves.chandelure;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(Type type, double pow, double acc){
        super(type, pow, acc);
    }
    private boolean flag = false;
    @Override
    protected void applyOppDamage(Pokemon def, double damage){

        if (def.getCondition().equals(Status.SLEEP)) {
            super.applyOppDamage(def, damage);
            flag = true;
        }
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        if (flag){
            int heal = (int) (-0.5 * (p.getStat(Stat.HP) - p.getHP()));
            p.setMod(Stat.HP, heal);
        }
    }

    @Override
    protected String describe(){
        return "применяет специальную атаку: Dream Eater";
    }
}
