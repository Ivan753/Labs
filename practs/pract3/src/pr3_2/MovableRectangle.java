package pr3_2;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString(){
        return "TopLeft: ("+this.topLeft.x+", "+this.topLeft.y+")\n"+"BottomRight: ("+this.bottomRight.x+", "+this.bottomRight.y+")\nSpeed (x, y): "+this.bottomRight.xSpeed+" "+this.bottomRight.ySpeed;
    }

    public boolean isCorrect(){
        return this.topLeft.xSpeed == this.bottomRight.xSpeed && this.topLeft.ySpeed==this.bottomRight.ySpeed;
    }

    @Override
    public void moveUp(){
        this.topLeft.y += this.topLeft.ySpeed;
        this.bottomRight.y += this.bottomRight.ySpeed;
    }

    @Override
    public void moveDown(){
        this.topLeft.y -= this.topLeft.ySpeed;
        this.bottomRight.y -= this.bottomRight.ySpeed;
    }

    @Override
    public void moveRight(){
        this.topLeft.x += this.topLeft.xSpeed;
        this.bottomRight.x += this.bottomRight.xSpeed;
    }

    @Override
    public void moveLeft(){
        this.topLeft.x -= this.topLeft.xSpeed;
        this.bottomRight.x -= this.bottomRight.xSpeed;
    }
}
