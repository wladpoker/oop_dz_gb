package org.example.hero;

import org.example.BaseHero;

public class Rogue extends BaseHero {
    public Rogue(String name) {
        super(name, 12);
    }
    public void step() {
        System.out.println("Разбойник идет...");
    }
    public String getInfo() {
        return "Я Разбойник";
    }
    @Override
    public void specialAbility() {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }

    public void pickPocket() {
        System.out.println(this.name + " обшаривает карманы.");
    }

    public void sneak() {
        System.out.println(this.name + " крадется.");
    }
}