package org.example.hero;

import org.example.BaseHero;

public class Crossbowman extends BaseHero {
    public Crossbowman(String name) {
        super(name, 10);
    }
    public void step() {
        System.out.println("Арбалетчик идет...");
    }
    @Override
    public String getInfo() {
        return "Я Арбалетчик";
    }
    @Override
    public void specialAbility() {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }

    public void reload() {
        System.out.println(this.name + " перезаряжает свой арбалет.");
    }

    public void fire() {
        System.out.println(this.name + " стреляет из арбалета.");
    }
}
