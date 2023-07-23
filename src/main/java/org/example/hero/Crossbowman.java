package org.example.hero;
import org.example.fighte.Crossbowmanfighte;

public class Crossbowman extends Crossbowmanfighte {
    public Crossbowman(String name, int x, int y) {
        super(name, "Crossbowman", 10, 4, 3, 6, x, y, 16, new int[]{2, 3});
    }
    @Override
    public String getInfo() {
        return "Crossbowman";
    }
}