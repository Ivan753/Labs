package lab5_1;
import java.lang.Math;
import java.awt.*;

public class Circle extends Shape{

    private int radius;


    public Circle(String color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }


    public int getRadius() {
        return radius;
    }


    @Override
    public void draw(Graphics g){

        g.setColor(Color.decode(this.getColor()));
        g.fillArc(this.getX(), this.getY(), this.getRadius(), this.getRadius(), 0, 360);

    }

}
