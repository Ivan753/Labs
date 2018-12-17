package pr8_1;

public final class Drink extends MenuItem implements Alcoholable{

    public Drink(String name, String desk, int cost) {
        super(name,desk,cost);
    }

    public Drink(String name, String desk) {
        super(name,desk);
    }

    private double alcoholVol;
    private DrinkTypeEnum type;

    public DrinkTypeEnum getType(){
        return this.type;
    }

    @Override
    public boolean isAlcoholDrink() {
        return Boolean.valueOf(String.valueOf(this.alcoholVol))?false:true;
    }

    @Override
    public double getAlcoholVol() {
        return this.alcoholVol;
    }
}
