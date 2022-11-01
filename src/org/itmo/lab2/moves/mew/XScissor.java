package org.itmo.lab2.moves.mew;

import ru.ifmo.se.pokemon.*;

public class XScissor extends PhysicalMove {
     public XScissor(Type type, double pow, double acc){
         super(type, pow, acc);
     }

    @Override
    protected String describe(){
         return "применяет физическую атаку: X-Scissor";
    }
}
