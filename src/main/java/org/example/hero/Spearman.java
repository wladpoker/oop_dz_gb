package org.example.hero;
import org.example.fighte.Infantryfighte;
public class Spearman extends Infantryfighte {
    public Spearman(String name, int x, int y) {
        super(name, "Spearman",10, 4, 5, 4, x, y, new int[] {1, 3});
    }
    @Override
    public String getInfo() {
        return "Spearman";
    }
}
