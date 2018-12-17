package lab5_1;
import java.awt.*;


public class Rectangle extends Shape {

    private int width;
    private int height;


    public Rectangle(String color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }


    @Override
    public void draw(Graphics g){

        g.setColor(Color.decode(this.getColor()));
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());

    }

}
