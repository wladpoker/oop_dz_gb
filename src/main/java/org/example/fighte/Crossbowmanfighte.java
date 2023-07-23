package org.example.fighte;
import org.example.BaseHero;
import org.example.hero.Peasant;
import java.util.ArrayList;

public abstract class Crossbowmanfighte extends BaseHero implements Character{
    protected int arrows;
    public int[] causeDamage;
    public Crossbowmanfighte(String name, String TYpe, int Health, int speed, int arm, int attack, int x, int y, int arrows, int[] causeDamage) {
        super(name, TYpe, Health, speed, arm, attack, x, y);
        this.arrows = arrows;
        this.causeDamage = causeDamage;
    }
    @Override
    public void step(ArrayList<BaseHero> attackers, ArrayList<BaseHero> targets) {
        if ((arrows > 0) && isAlive) {
            BaseHero target = findTarget(targets);
            if (target.getArmor() < this.attack) {
                target.getDamage(this.attackPower(target));
            } else {
                target.getDamage(this.attackPower(target) / 2);
            }
            arrows--;
            for (BaseHero hero : attackers) {
                if (hero.getInfo().equals("Peasant")) {
                    Peasant deliver = (Peasant) hero;
                    if (deliver.getDelivery()) {
                        arrows++;
                        deliver.hasDelivery = false;
                        break;
                    }
                }
            }
        }
    }
    public int attackPower(BaseHero target) {
        int attackPower;
        if (this.coord.getDist(target.getCoord()) < 5) {
            attackPower = this.causeDamage[1];
        } else if (this.coord.getDist(target.getCoord()) >= 5) {
            attackPower = this.causeDamage[0];
        } else {
            attackPower = (this.causeDamage[0] + this.causeDamage[1]) / 2;
        }
        return attackPower;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("\t☠️%-3d\t➹%-3d", (causeDamage[0] + causeDamage[1]) / 2, arrows);
    }

}
