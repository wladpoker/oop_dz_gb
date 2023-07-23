package org.example.fighte;
import org.example.BaseHero;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class magicfighte extends BaseHero {
    protected int mana;
    protected int causeDamage;
    public magicfighte(String name, String TYpe, int Health, int speed, int arm, int attack, int x, int y, int causeDamage) {
        super(name, TYpe, Health, speed, arm, attack, x, y);
        this.mana = 100;
        this.causeDamage = causeDamage;
    }
    @Override
    public void step(ArrayList<BaseHero> attackers, ArrayList<BaseHero> targets) {
        if (isAlive && (mana > 0)) {
            ArrayList<BaseHero> victims = new ArrayList<>();
            for (BaseHero hero : attackers) {
                if (!(hero.TYpe.equals("Monk")) && !(hero.TYpe.equals("Witch")) && !(hero.TYpe.equals("Peasant"))) {
                    victims.add(hero);
                }
            }
            victims.sort(new Comparator<BaseHero>() {
                @Override
                public int compare(BaseHero o1, BaseHero o2) {
                    return o1.getHealth() - o2.getHealth();
                }
            });

            for (BaseHero victim : victims) {
                if (victim.isAlive() && victim.Health < victim.maxHealth) {
                    healHero(victim);
                    break;
                } else if (!victim.isAlive() && mana >= 50) {
                    victim.isAlive = true;
                    victim.Health = maxHealth;
                    mana = mana - 50;
                    break;
                }
            }
        }
    }
    public void healHero(BaseHero target) {
        if (mana >= causeDamage) {
            target.healing(causeDamage);
            mana = mana - causeDamage;
        } else {
            target.healing(mana);
            mana = 0;
        }
    }
    @Override
    public String toString() {
        return super.toString() + String.format("\t★%-3d\t⛨%-3d", causeDamage, mana);
    }

}
