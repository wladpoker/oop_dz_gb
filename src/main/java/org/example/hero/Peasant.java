package org.example.hero;
import org.example.BaseHero;
import java.util.ArrayList;
public class Peasant extends BaseHero {
    public boolean hasDelivery;
    public Peasant(String name, String type, int hp, int speed, int armor, int hit, int x, int y, boolean hasDelivery) {
        super(name, type, hp, speed, armor, hit, x, y);
        this.hasDelivery = hasDelivery;
    }
    public Peasant(String name, int x, int y) {
        this(name, "Peasant", 1, 3, 1, 1, x, y,true);
    }
    public boolean getDelivery() {
        return hasDelivery;
    }
    @Override
    public void step(ArrayList<BaseHero> attackers, ArrayList<BaseHero> targets) {
        if (isAlive) System.out.print(' ');
    }
    @Override
    public String getInfo() {
        return "Peasant";
    }
    @Override
    public String toString() {
        if (hasDelivery) {
            return super.toString() + "\t➷            ";
        } else {
            return super.toString() + "\t✖            ";
        }
    }
}
