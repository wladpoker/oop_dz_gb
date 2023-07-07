package org.example.hero;

import org.example.BaseHero;

public class Sniper extends BaseHero {
    public Sniper(String name, int hp) {
        super(name, hp);
    }


    @Override
    public void specialAbility() {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }

    public void aim() {
        System.out.println(this.name + " is aiming the sniper rifle.");
    }

    public void shoot() {
        System.out.println(this.name + " is shooting the sniper rifle.");
    }
}
