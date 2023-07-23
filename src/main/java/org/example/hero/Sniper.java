package org.example.hero;
import org.example.fighte.Crossbowmanfighte;
public class Sniper extends Crossbowmanfighte {
    public Sniper(String name, int x, int y) {
        super(name, "Sniper", 15, 9, 10, 12, x, y, 32, new int[]{8, 10});
    }
    @Override
    public String getInfo() {
        return "Sniper";
    }

}
