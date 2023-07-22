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
    protected int magic;
    private String name;
    private int maxHealth;
    private boolean isDead;
    private String state;

    public BaseHero(int i, int i1, int i11, String name, int i3, int i4, int i5, int i6, String s) {
        this.name = this.name;
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
        this.isDead = false;
        this.state = "Stand";
    }

    public BaseHero(String name, int attack, int defense, int shots, int minDamage, int maxDamage, int health,
                    int speed, int delivery, int magic) {
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
        this.isDead = false;
        this.state = "Stand";
    }

    public BaseHero(String name, int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    public BaseHero(String name, int attack, int defense, int health, int speed, int delivery, int magic) {
    }

    public BaseHero(String name, int i, int i1, int i2, int i3, int i4, int i5, int i6) {
    }

    public String getName() {
        return name;
    }

    public abstract void attack(BaseHero hero);

    public abstract void move(int deltaX, int deltaY);

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

    protected Object getHealth() {
        return health;
    }

    private Object getLv() {
        return lv;
    }


    public Object getSpeed() {
        return speed;
    }

    private Object getDelivery() {
        return delivery;
    }

    private Object getMagic() {
        return magic;
    }

    public int getMaxHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        if (!isDead) {
            health -= damage;
            if (health <= 0) {
                isDead = true;
                state = "Dead";
            }
        }
    }

    public void heal(int amount) {
        if (!isDead) {
            health += amount;
            if (health > 0) {
                health = getMaxHealth();
            }
        }
    }


    public boolean isDead() {
        return isDead;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public void step() {
    }


    public void GetDamage(int damage) {
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
