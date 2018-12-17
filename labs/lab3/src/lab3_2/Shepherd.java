package lab3_2;

public class Shepherd extends Dog{

    private String color;

    public Shepherd(String color) {
        super("Овчарка");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return super.toString()+"; color: "+this.color;
    }
}
