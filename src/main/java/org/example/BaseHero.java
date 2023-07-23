package org.example;
import org.example.fighte.Character;
import org.example.gui.Coords;
import java.util.ArrayList;
public abstract class BaseHero implements Character {
    protected final String Name;
    public final String TYpe;
    public int maxHealth;
    protected int speed;
    protected int arm;
    protected int attack;
    public boolean isAlive = true;
    protected Coords coord;
    public int Health;
    public BaseHero(String name, String type, int Health, int speed, int armor, int attack, int x, int y) {
        Name = name;
        TYpe = type;
        this.Health = Health;
        this.maxHealth = Health;
        this.speed = speed;
        this.arm = armor;
        this.attack = attack;
        coord = new Coords(x, y);
    }
    public String getType() {
        return TYpe;
    }
    public int getHealth() {
        return Health;
    }
    public int getSpeed() {
        return speed;
    }
    public int getArmor() {
        return arm;
    }
    public boolean isAlive() {
        return isAlive;
    }
    public Coords getCoord() {
        return coord;
    }
    public void getDamage(int damage) {
        if (Health > damage) {
            Health = this.Health - damage;
        } else {
            Health = 0;
            isAlive = false;
        }
    }
    @Override
    public void healing(int addHp) {
        Health = Math.min(Health + addHp, maxHealth);
    }
    @Override
    public String toString() {
        return String.format("\t%-12s\t⚔️ %-3d\t\uD83D\uDEE1 %-3d\t♥️%-3d%%", TYpe, attack, arm, (Health * 100 / maxHealth));
    }
    @Override
    public int compare(BaseHero o1, BaseHero o2) {
        return o1.getSpeed() - o2.getSpeed();
    }
    protected BaseHero findTarget(ArrayList<BaseHero> team) {
        float minDist = 13;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).isAlive()) {
                float dist = coord.getDist(team.get(i).coord);
                if (dist < minDist) {
                    minDist = dist;
                    index = i;
                }
            }
        }
        return team.get(index);
    }
}
