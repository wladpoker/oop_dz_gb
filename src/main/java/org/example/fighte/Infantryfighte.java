package org.example.fighte;
import org.example.BaseHero;
import org.example.gui.Coords;
import java.util.ArrayList;
public abstract class Infantryfighte extends BaseHero {
    public int[] causeDamage;
    public Infantryfighte(String name, String TYpe, int Health, int speed, int arm, int attack, int x, int y, int[] causeDamage) {
        super(name, TYpe, Health, speed, arm, attack, x, y);
        this.causeDamage = causeDamage;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("\t☠️%-3d        ", (causeDamage[0] + causeDamage[1]) / 2);
    }
    @Override
    public void step(ArrayList<BaseHero> attackers, ArrayList<BaseHero> targets) {
        BaseHero target = findTarget(targets);
        if (isAlive) {
            if (coord.getDist(target.getCoord()) < 1.5) {
                if (target.getArmor() < this.attack) {
                    target.getDamage(causeDamage[1]);
                } else {
                    target.getDamage(causeDamage[0]);
                }
            } else {
                this.move(target, attackers);
            }
        }
    }
    public void move(BaseHero unitAim, ArrayList<BaseHero> friends) {
        Coords temp = this.coord;
        int dX = this.coord.getX() - unitAim.getCoord().getX();
        int dY = this.coord.getY() - unitAim.getCoord().getY();
        if (Math.abs(dX) >= Math.abs(dY)) {
            if (dX > 0) {
                temp.setX(temp.getX() - 1);
                if (checkCells(temp, friends)) {
                    this.coord.setX(this.coord.getX() - 1);
                }
            } else {
                temp.setX(temp.getX() + 1);
                if (checkCells(temp, friends)) {
                    this.coord.setX(this.coord.getX() + 1);
                }
            }
        } else {
            if (dY > 0) {
                temp.setY(temp.getY() - 1);
                if (checkCells(temp, friends)) {
                    this.coord.setY(this.coord.getY() - 1);
                }
            } else {
                temp.setY(temp.getY() + 1);
                if (checkCells(temp, friends)) {
                    this.coord.setY(this.coord.getY() + 1);
                }
            }
        }
    }
    public boolean checkCells(Coords newPosition, ArrayList<BaseHero> friends) {
        for (BaseHero friend : friends) {
            if (newPosition.isEquals(friend.getCoord())) return false;
        }
        return true;
    }
}
