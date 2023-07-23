package org.example.hero;
import org.example.fighte.Infantryfighte;
public class Rogue extends Infantryfighte {
    public Rogue(String name, int x, int y) {
        super(name, "Rogue", 10, 6, 3, 8, x, y, new int[]{2, 4});
    }
    @Override
    public String getInfo() {
        return "Rogue";
    }
    }