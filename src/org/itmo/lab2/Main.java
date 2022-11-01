package org.itmo.lab2;

import ru.ifmo.se.pokemon.*;
import org.itmo.lab2.pokemons.*;

public class Main {

    public static void main(String[] args) {

        Battle b = new Battle();

        Mew p1 = new Mew("Мявка", 1);
        Ferroseed p2 = new Ferroseed("Яйцо Колючее", 30);
        Ferrothorn p3 = new Ferrothorn("Летающая тарелка", 30);
        Litwick p4 = new Litwick("Свечка", 52);
        Lampent p5 = new Lampent("Фонарь", 1);
        Chandelure p6 = new Chandelure("Люстра", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}