package org.example.hero;
import org.example.fighte.magicfighte;
public class Monk extends magicfighte {
    public Monk(String name, int x, int y) {
        super(name, "Monk", 30, 5, 7, 12, x, y, 4);
    }
    @Override
    public String getInfo() {
        return "Monk";
    }

}