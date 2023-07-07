package org.example.hero;

import org.example.BaseHero;

public class Warlock extends BaseHero {
    public Warlock(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void specialAbility() {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }

    public void curse() {
        System.out.println(this.name + " is cursing the enemy.");
    }

    public void summonDemon() {
        System.out.println(this.name + " is summoning a demon.");
    }
}
