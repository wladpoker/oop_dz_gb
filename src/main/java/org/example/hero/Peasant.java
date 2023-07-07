package org.example.hero;

import org.example.BaseHero;

/**
 * Каждый из этих классов наследует свойства и методы от 
 * базового класса BaseHero и добавляет свои уникальные 
 * свойства и методы в соответствии с конкретным классом персонажа.
 */
public class Peasant extends BaseHero {
    public Peasant(String name, int lv) {
        super(name, lv);
    }

    public Peasant() {
        super();
    }

    public void plow() {
        System.out.println(this.name + " is plowing the field.");
    }

    public void harvest() {
        System.out.println(this.name + " is harvesting the crops.");
    }

    @Override
    public void specialAbility() {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }
}


