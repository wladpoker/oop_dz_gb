package org.example.hero;
import org.example.BaseHero;
public class Crossbowman extends BaseHero {


    public Crossbowman(String name) {
        super(name, 6);
    }

    @Override
    public void specialAbility() {

    }


    public void step() {
        System.out.println("Арбалетчик идет...");

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
    }

    private BaseHero[] getEnemies() {
        return new BaseHero[0];
    }
}