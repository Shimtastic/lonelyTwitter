package ca.ualberta.cs.lonelytwitter.Models;

public abstract class Shape {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int newX) {
        x = newX;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void draw();

}