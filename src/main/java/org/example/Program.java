package org.example;

import org.example.hero.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {


    public static void main() {

        List<BaseHero> holyTeam = new ArrayList<>();
        List<BaseHero> darkTeam = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int heroType1 = random.nextInt(4); // Случайный тип персонажа от 0 до 3
            int heroType2 = random.nextInt(4) + 4; // Случайный тип персонажа от 4 до 7
            switch (heroType1) {
                case 0:
                    holyTeam.add(new Peasant("Крестьянин #" + i));
                    break;
                case 1:
                    holyTeam.add(new Rogue("Разбойник #" + i));
                    break;
                case 2:
                    holyTeam.add(new Sniper("Снайпер #" + i));
                    break;
                case 3:
                    holyTeam.add(new Warlock("Колдун #" + i));
                    break;
            }
            switch (heroType2) {
                case 4:
                    darkTeam.add(new Peasant("Крестьянин #" + i));
                    break;
                case 5:
                    darkTeam.add(new Spearman("Копейщик #" + i));
                    break;
                case 6:
                    darkTeam.add(new Crossbowman("Арбалетчик #" + i));
                    break;
                case 7:
                    darkTeam.add(new Monk("Монах #" + i));
                    break;
            }
        }

        List<BaseHero> allHeroes = new ArrayList<>();
        allHeroes.addAll(holyTeam);
        allHeroes.addAll(darkTeam);


        // Выводим информацию обо всех персонажах
        for (BaseHero hero : allHeroes) {
            System.out.println(hero.getInfo());
        }
        Peasant farmer = new Peasant("John", 10, 20);
        for(int i = 1;i<=10;i++){

            System.out.println("Round " + i + ":");

            for (BaseHero c : allHeroes) {
                c.step();
                System.out.println(c.getName() + " is " + c.getState() + " with " + c.getHealth() + " health.");
            }

            System.out.println();
        }

    }
}
