package org.itmo.lab2.moves.ferroseed;

import ru.ifmo.se.pokemon.*;

public class PinMissile extends PhysicalMove {
    public PinMissile(Type type, double pow, double acc){
        super(type, pow, acc);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage);

        if (Math.random() <= 3.0/8.0) {
            System.out.println("Второе попадание!");
            def.setMod(Stat.HP,(int) (2 * damage));
            if (Math.random() <= 3.0/8.0) {
                System.out.println("Третье попадание!");
                def.setMod(Stat.HP,(int) (3 * damage));
                if (Math.random() <= 1.0/8.0) {
                    System.out.println("Четвёртое попадание!!");
                    def.setMod(Stat.HP,(int) (4 * damage));
                    if (Math.random() <= 1.0/8.0) {
                        System.out.println("Пятое попадание!!!");
                        def.setMod(Stat.HP,(int) (5 * damage));
                    }
                }
            }
        }
    }

    @Override
    protected String describe(){
        return "применяет физическую атаку: Pin Missile";
    }
}
