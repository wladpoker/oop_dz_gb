package org.example.gui;

public class Coords {
    protected int x, y;
    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public float getDist(Coords pos) {
        return (float) Math.sqrt(Math.pow((this.x-pos.getX()), 2) + Math.pow((this.y - pos.getY()), 2));
    }
    public boolean isEquals(Coords Coords) {
        return this.x == Coords.getX() && this.y == Coords.getY();
    }

}
