package org.example;
import java.util.Random;

public abstract class BaseHero {
    protected static int number;
    protected static Random r;
    protected int delivery;
    protected int lv;
    protected int maxLv;
    private int speed;
    protected String name;

    public BaseHero(String name) {
        this.name = name;
        this.lv = 2;
        this.maxLv = 10;
        this.speed = 6;
        this.delivery = 0;
    }

    public BaseHero(String name, int speed) {
        this.name = name;
        this.lv = lv;
        this.maxLv = lv;
        this.speed = speed;
        this.delivery = delivery;
    }

    protected String getName() {
        return name;
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


    public String getInfo() {
        return String.format("Name: %s, Lv: %d, Speed: %d, Delivery: %d", this.getName(), this.getLv(), this.getSpeed(), this.getDelivery());
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

