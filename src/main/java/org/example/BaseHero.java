package org.example;
import java.util.Random;

public abstract class BaseHero {
    protected static int number;
    protected static Random r;

    protected String name;
    protected int lv;
    protected int maxLv;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    public BaseHero(String name, int lv) {
        this.name = name;
        this.lv = lv;
        this.maxLv = lv;
    }

    public BaseHero() {
        this(String.format("Hero #%d", ++BaseHero.number),
                BaseHero.r.nextInt(100, 200));
    }

    public String getInfo() {
        return String.format("Name: %s  Level: %d  Type: %s",
                this.name, this.lv, this.getClass().getSimpleName());
    }

    public void level(int lv) {

        this.lv = lv + this.lv > this.maxLv ? this.maxLv : lv + this.lv;
    }


    public abstract void specialAbility();
}
