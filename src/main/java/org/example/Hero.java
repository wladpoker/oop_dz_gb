package org.example;
import org.example.gui.View;
import org.example.hero.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
public class Hero {
    public static void buildGrups() {
        Program.teamWhite = new ArrayList<>();
        for (int i = 1; i < Program.Party_Size + 1; i++) {
            switch (new Random().nextInt(4)) {
                case 0 -> Program.teamWhite.add(new Monk(getName(), 1, i));
                case 1 -> Program.teamWhite.add(new Crossbowman(getName(), 1, i));
                case 2 -> Program.teamWhite.add(new Spearman(getName(), 1, i));
                default -> Program.teamWhite.add(new Peasant(getName(), 1, i));
            }
        }
        Program.teamBlack = new ArrayList<>();
        for (int i = 1; i < Program.Party_Size + 1; i++) {
            switch (new Random().nextInt(4)) {
                case 0 -> Program.teamBlack.add(new Warlock(getName(), 10, i));
                case 1 -> Program.teamBlack.add(new Sniper(getName(), 10, i));
                case 2 -> Program.teamBlack.add(new Rogue(getName(), 10, i));
                default -> Program.teamBlack.add(new Peasant(getName(), 10, i));
            }
        }

    }
    public static void makeStep() {
        Program.teamWhite.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                return o2.getSpeed() - o1.getSpeed();
            }
        });
        Program.teamBlack.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                return o2.getSpeed() - o1.getSpeed();
            }
        });
        for (int i = 0; i < Program.Party_Size; i++) {
            Program.teamWhite.get(i).step(Program.teamWhite, Program.teamBlack);
            Program.teamBlack.get(i).step(Program.teamBlack, Program.teamWhite);
        }
    }
    private static String getName() {
        return View.NameHero.values()[new Random().nextInt(View.NameHero.values().length)].toString();
    }
    public static boolean heroIsAlive(ArrayList<BaseHero>team) {
        for (BaseHero hero:team) {
            if (hero.isAlive()) return true;
        }
        return false;
    }
}
