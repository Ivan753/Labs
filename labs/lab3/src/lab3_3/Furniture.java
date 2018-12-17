package lab3_3;

public abstract class Furniture {

    private String brand;

    public Furniture(String brand) {
        this.brand = brand;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString(){
        return "Brand: "+this.brand;
    }
}
