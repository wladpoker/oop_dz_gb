package org.example.hero;

import org.example.BaseHero;

public class Spearman extends BaseHero {
    public Spearman(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void specialAbility() {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }

    public void brace() {
        System.out.println(this.name + " is bracing with their spear.");
    }

    public void thrust() {
        System.out.println(this.name + " is thrusting their spear.");
    }
}
