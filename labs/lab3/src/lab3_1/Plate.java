package lab3_1;

public class Plate extends Dish {

    private String type;

    public Plate(String color, String type) {
        super(color);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return super.toString()+"; type: "+this.type;
    }

}
