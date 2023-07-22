package org.example.hero;
import java.util.ArrayList;
import org.example.BaseHero;
import org.example.Character;
public class Warlock extends BaseHero {
    private ArrayList<Character> party;

    public Warlock(String name) {
        super(17, 12, 0, "-5", 30, 9, 0, 1, name);
    }

    // Второй конструктор с возможностью задания всех характеристик героя
    public Warlock(int attack, int defense, int shots, String damage, int health, int speed, int delivery, int magic, String name) {
        super(attack, defense, shots, damage, health, speed, delivery, magic, name);
    }

    @Override
    public void attack(BaseHero hero) {

    }

    @Override
    public void move(int deltaX, int deltaY) {

    }


    public void step() {
        if (!isDead()) {
            setState("Stand");

            Character target = null;
            int lowestHealth = Integer.MAX_VALUE;
            for (Character c : party) {
                if (!c.isDead() && c.getHealth() < lowestHealth) {
                    target = c;
                    lowestHealth = c.getHealth();
                }
            }
            if (target != null) {
                heal(10); // Change this to adjust the amount healed
            }
        }


    }
    public void specialAbility () {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }

}

