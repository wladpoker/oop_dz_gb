package org.example.fighte;
import org.example.BaseHero;
import java.util.ArrayList;

public interface Character {
    void step(ArrayList<BaseHero> attackers, ArrayList<BaseHero> targets);
    String getInfo();
    void healing(int addHp);
    int compare(BaseHero o1, BaseHero o2);
}