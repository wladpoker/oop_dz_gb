package org.example.hero;

import org.example.BaseHero;

public class Monk extends BaseHero {
    public Monk(String name) {
        super(name, 9);
    }
    public void step() {
        System.out.println("Монах идет...");
    }
    public String getInfo() {
        return "Я Монах";
    }
    @Override
    public void specialAbility() {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }

    public void meditate() {
        System.out.println(this.name + " медитирует.");
    }

    public void heal() {
        System.out.println(this.name + " использует свои целебные силы.");
    }
}
