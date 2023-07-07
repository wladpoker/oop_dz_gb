package org.example.hero;

import org.example.BaseHero;

public class Crossbowman extends BaseHero {
    public Crossbowman(String name, int lv) {
        super(name, lv);
    }
    @Override
    public void specialAbility() {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }

    public void reload() {
        System.out.println(this.name + " is reloading their crossbow.");
    }

    public void fire() {
        System.out.println(this.name + " is firing their crossbow.");
    }
}
