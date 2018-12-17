package lab4_2;

import java.text.NumberFormat;
import java.util.Locale;

public class Car implements Priceable {

    private double price;
    private String sprice;

    public Car(double price) {
        this.price = price;
    }


    @Override
    public String getPrice(){
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CANADA);
        this.sprice = format.format(this.price);
        return "Price: "+this.sprice;
    }

}
