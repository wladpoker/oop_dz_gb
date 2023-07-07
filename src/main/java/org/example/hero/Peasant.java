package org.example.hero;

import org.example.BaseHero;

public class Peasant extends BaseHero {
    public Peasant(String name) {
        super(name, 10);
    }

    public void step() {
        System.out.println("Крестьянин идет...");
    }
    @Override
    public String getInfo() {
        return "Я Крестьянин";
    }
    public void plow() {
        System.out.println(this.name + " вспахивает поле.");
    }

    public void harvest() {
        System.out.println(this.name + " собирает урожай.");
    }

    @Override
    public void specialAbility() {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }
}


