package lab5_1;

import java.awt.*;

abstract public class Shape {

    private String color;
    private int x;
    private int y;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Shape(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    abstract public void draw(Graphics g);
}
