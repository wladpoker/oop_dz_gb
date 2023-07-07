package org.example.hero;

import org.example.BaseHero;

public class Warlock extends BaseHero {
    public Warlock(String name) {
        super(name, 5);
    }

    public void step() {
        System.out.println("Колдун идет...");
    }

    public String getInfo() {
        return "Я Колдун";
    }

    @Override
    public void specialAbility() {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }

    public void curse() {
        System.out.println(this.name + " проклинает врага.");
    }

    public void summonDemon() {
        System.out.println(this.name + " вызывает демона.");
    }
}
