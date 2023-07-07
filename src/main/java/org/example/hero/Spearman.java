package org.example.hero;

import org.example.BaseHero;

public class Spearman extends BaseHero {
    public Spearman(String name) {
        super(name, 15);
    }

    public void step() {
        System.out.println("Копейщик идет...");
    }

    public String getInfo() {
        return "Я Копейщик";
    }
    @Override
    public void specialAbility() {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }

    public void brace() {
        System.out.println(this.name + " упирается своим копьем.");
    }

    public void thrust() {
        System.out.println(this.name + " вонзает свое копье.");
    }
}
