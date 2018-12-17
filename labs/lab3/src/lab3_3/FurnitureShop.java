package lab3_3;

public class FurnitureShop {

    public Table[] table = new Table[20];
    public Stool[] stool = new Stool[20];

    public FurnitureShop() {
    }

    @Override
    public String toString(){
        return "Max quantity of furniture: 20 tables and 20 stools";
    }
}
