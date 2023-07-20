package org.example;
import java.util.Random;

public abstract class BaseHero {
    protected static int number;
    protected static Random r;
    protected int lv;
    protected int maxLv;
    private int attack;
    private int defense;
    private int shots;
    private int minDamage;
    private int maxDamage;
    private int health;
    private int speed;
    private int delivery;
    private int magic;
    protected String name;

    public BaseHero(String name, int attack, int defense, int health, int speed, int delivery, int magic) {
        this.name = name;
        this.attack = 8;
        this.defense = 3;
        this.shots = 0;
        this.minDamage = 2;
        this.maxDamage = 4;
        this.health = 10;
        this.lv = 2;
        this.maxLv = 10;
        this.speed = 6;
        this.delivery = 0;
        this.magic = 0;
    }

    public BaseHero(String name, int speed) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.shots = shots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.health = health;
        this.lv = lv;
        this.maxLv = lv;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
    }

    protected String getName() {
        return name;
    }

    private Object getAttack() {
        return attack;
    }

    private Object getDefense() {
        return defense;
    }

    private Object getShots() {
        return shots;
    }

    private Object getDamageMin() {
        return minDamage;
    }

    private Object getDamageMax() {
        return maxDamage;
    }

    public int getHealth() {
        return health;
    }

    private Object getLv() {
        return lv;
    }


    private Object getSpeed() {
        return speed;
    }

    private Object getDelivery() {
        return delivery;
    }

    private Object getMagic() {
        return magic;
    }

    public String getShortDescription() {
        return String.format("Name: %s, Health: %d, Attack: %d, Defense: %d, Damage: %d-%d",
                this.getName(), this.getHealth(), this.getAttack(), this.getDefense(),
                this.getDamageMin(), this.getDamageMax());
    }

    public String getInfo() {
        return String.format("Name: %s, Health: %d, Attack: %d, Defense: %d, Damage: %d-%d, Lv: %d, Speed: %d, Delivery: %d", 
        this.getName(), this.getHealth(), this.getAttack(), this.getDefense(),
                this.getDamageMin(), this.getDamageMax(), this.getLv(), this.getSpeed(), this.getDelivery());
    }

    public void level(int lv) {

        this.lv = lv + this.lv > this.maxLv ? this.maxLv : lv + this.lv;
    }


    public abstract void specialAbility();


    public BaseHero(String name, int x, int y) {
        this.name = name;
        this.coord = new Coord(x, y);
    }

    protected Coord coord;

    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public int GetDamage(int damage) {
        return 1;
    }


    protected static class Coord {
        private int x;
        private int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}

