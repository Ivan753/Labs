package pr3_2;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);;
    }

    public String toString(){
        return "Center: ("+this.center.x+", "+this.center.y+")\nSpeed (x, y): "+this.center.xSpeed+" "+this.center.ySpeed;
    }

    @Override
    public void moveUp(){
        this.center.y += this.center.ySpeed;
    }

    @Override
    public void moveDown(){
        this.center.y -= this.center.ySpeed;
    }

    @Override
    public void moveRight(){
        this.center.x += this.center.xSpeed;
    }

    @Override
    public void moveLeft(){
        this.center.x -= this.center.xSpeed;
    }
}
