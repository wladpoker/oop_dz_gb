package org.example;
import org.example.gui.View;
import java.util.ArrayList;
import java.util.Scanner;
public class Program {
    public static final int Party_Size = 10;
    public static ArrayList<BaseHero> teamWhite;
    public static ArrayList<BaseHero> teamBlack;
    public static void main(String[] args) {
        Hero.buildGrups();
        Scanner scanner = new Scanner(System.in);
        while (Hero.heroIsAlive(teamWhite) && Hero.heroIsAlive(teamBlack)) {
            View.view();
            Hero.makeStep();
            scanner.nextLine();
        }
        View.view();

    }
}
