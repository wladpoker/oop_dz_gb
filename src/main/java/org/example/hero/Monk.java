package org.example.hero;

import org.example.BaseHero;


public class Monk extends BaseHero {
    private int magic;

    public Monk(String name, int attack, int defense, int shots, int damageMin, int damageMax,
                int health, int speed, int mana) {
        super(name, attack, defense, shots, damageMin, damageMax, health, speed);
        this.magic = mana;
    }

    @Override
    public void attack(BaseHero hero) {

    }

    @Override
    public void move(int deltaX, int deltaY) {

    }

    public Monk(String name) {
        super(name, 12, 7, 0, -4, -4, 30, 5);
        this.magic = 1;
    }

    public int getMagic() {
        return magic;
    }

    public void step() {
        if (!isDead()) {
            setState("Stand");
        }
    }
    public void specialAbility() {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }
}