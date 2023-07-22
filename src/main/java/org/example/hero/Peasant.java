package org.example.hero;

import org.example.BaseHero;

public class Peasant extends BaseHero {

    private int attack;
    private int defense;
    private int shots;
    private int damage;
    private int health;
    private int speed;
    private int delivery;
    private int magic;

    public Peasant(String name) {
        super(name);
        this.attack = 1;
        this.defense = 1;
        this.shots = 0;
        this.damage = 1;
        this.health = 11;
        this.speed = 3;
        this.delivery = 3;
        this.magic = 0;
    }

    public Peasant(String name, int attack, int defense, int shots, int damage, int health, int speed, int delivery,
            int magic) {
        super(name);
        this.attack = attack;
        this.defense = defense;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
    }
    public Peasant(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public void attack(BaseHero hero) {
        System.out.println("Peasant " + getName() + " attacks " + hero.getName());
    }

    @Override
    public void move(int deltaX, int deltaY) {
        System.out.println("Farmer " + getName() + " moves to (" + (coord.getX() + deltaX) + ", " + (coord.getY() + deltaY) + ")");
        coord.setX(coord.getX() + deltaX);
        coord.setY(coord.getY() + deltaY);
    }
    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getShots() {
        return shots;
    }

    public int getDamage() {
        return damage;
    }

    public Object getHealth() {
        return health;
    }

    public Object getSpeed() {
        return speed;
    }

    public int getDelivery() {
        return delivery;
    }

    public int getMagic() {
        return magic;
    }

    @Override
    public void specialAbility() {
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }

    public void step() {
        if (!isDead()) {
            setState("Stand");
        }
    }
}
