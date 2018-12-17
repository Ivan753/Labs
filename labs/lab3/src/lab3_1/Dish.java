package lab3_1;

public abstract class Dish {

    private String color;

    public Dish(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color: "+this.color;
    }
}
