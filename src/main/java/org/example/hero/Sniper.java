package org.example.hero;

import org.example.BaseHero;

public class Sniper extends BaseHero {
    public Sniper(String name) {
        super(name, 5);
    }

    public void step() {
        System.out.println("Снайпер идет...");
    }

    public String getInfo() {
        return "Я Снайпер";
    }
    @Override
    public void specialAbility() {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }

    public void aim() {
        System.out.println(this.name + " целится из снайперской винтовки.");
    }

    public void shoot() {
        System.out.println(this.name + " стреляет из снайперской винтовки.");
    }
}
