package org.itmo.lab2.moves.mew;

import ru.ifmo.se.pokemon.*;

public class WildCharge extends PhysicalMove{
    public WildCharge(Type type, double pow, double acc){
        super(type, pow, acc);
    }
    @Override
    protected void applySelfDamage(Pokemon def, double damage){
        super.applySelfDamage(def, damage);

        System.out.println(def + " попадает по себе.");
        def.setMod(Stat.HP, (int) Math.round(0.25 * damage));
    }

    @Override
    protected String describe(){
        return "применяет физическую атаку: Wild Charge";
    }
}
