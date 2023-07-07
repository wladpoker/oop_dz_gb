package org.example.hero;

import org.example.BaseHero;

public class Rogue extends BaseHero {
    public Rogue(String name, int lv) {
        super(name, lv);
    }

    @Override
    public void specialAbility() {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }

    public void pickPocket() {
        System.out.println(this.name + " is picking pockets.");
    }

    public void sneak() {
        System.out.println(this.name + " is sneaking around.");
    }
}