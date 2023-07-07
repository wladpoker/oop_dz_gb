package org.example.hero;

import org.example.BaseHero;

public class Monk extends BaseHero {
    public Monk(String name, int lv) {
        super(name, lv);
    }

    @Override
    public void specialAbility() {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }

    public void meditate() {
        System.out.println(this.name + " is meditating.");
    }

    public void heal() {
        System.out.println(this.name + " is using their healing powers.");
    }
}
