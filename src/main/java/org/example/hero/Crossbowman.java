package org.example.hero;
import org.example.BaseHero;
public class Crossbowman extends BaseHero {

    private int shots;
    private int minDamage;
    private int maxDamage;

    public Crossbowman(String name, int attack, int defense, int shots, int minDamage, int maxDamage, int health,
            int speed, int delivery, int magic) {
        super(name, attack, defense, health, speed, delivery, magic);
        this.shots = shots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public Crossbowman(String name, int health, int speed) {
        super(name, 6, 3, health, speed, 0, 0);
        this.shots = 16;
        this.minDamage = 2;
        this.maxDamage = 3;
    }

    @Override
    public void specialAbility() {

    }

    public int getShots() {
        return shots;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
    public void step() {
        if ((getHealth() == 0) || (shots == 0)) {
            return;
        }
            // Поиск ближайшего противника
        BaseHero closestEnemy = null;
        double closestDistance = Double.MAX_VALUE;
        for (BaseHero enemy : getEnemies()) {
            double distance = Math.sqrt(Math.pow(enemy.getX() - getX(), 2) + Math.pow(enemy.getY() - getY(), 2));
            if (distance < closestDistance) {
                closestEnemy = enemy;
                closestDistance = distance;
            }
        }

        if (closestEnemy != null) {
            int damage = (int) Math.round((getMinDamage() + getMaxDamage()) / 2.0);
            closestEnemy.GetDamage(damage);
        }
    
        // Поиск крестьянина
        Peasant closestFarmer = null;
        closestDistance = Double.MAX_VALUE;
        for (Peasant farmer : getPeasant()) {
            double distance = Math.sqrt(Math.pow(farmer.getX() - getX(), 2) + Math.pow(farmer.getY() - getY(), 2));
            if (distance < closestDistance) {
                closestFarmer = farmer;
                closestDistance = distance;
            }
        }
    
        // Если нет крестьянина, то уменьшаем запас стрел
        if (closestFarmer == null) {
            shots--;
        }
}

    private Peasant[] getPeasant() {
        return new Peasant[0];
    }

    private BaseHero[] getEnemies() {
        return new BaseHero[0];
    }
}