package lab3_3;

public class Table extends Furniture {

    private String kind_trees;

    public Table(String brand, String kind_trees) {
        super(brand);
        this.kind_trees = kind_trees;
    }

    public String getKind_trees() {
        return kind_trees;
    }

    public void setKind_trees(String kind_trees) {
        this.kind_trees = kind_trees;
    }

    @Override
    public String toString(){
        return super.toString()+"; Kind table trees: "+this.kind_trees;
    }
}
