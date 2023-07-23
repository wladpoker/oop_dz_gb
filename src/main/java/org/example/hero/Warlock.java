package org.example.hero;

import org.example.fighte.magicfighte;

public class Warlock extends magicfighte {

    public Warlock(String name, int x, int y) {
        super(name, "Warlock", 30, 9, 12, 17, x, y, 5);
    }

    @Override
    public String getInfo() {
        return "Warlock";
    }

}

