package lab3_3;

public class FurnitureTest {

    public static void main(String[] args) {

        FurnitureShop shop = new FurnitureShop();

        for(int i = 0; i < 5; i++){

            shop.table[i] = new Table("Apple", "oak"+Integer.toString(i));
            System.out.println(shop.table[i].toString());

            shop.stool[i] = new Stool("Nokia", "palka"+Integer.toString(i));
            System.out.println(shop.stool[i].toString());

            System.out.println();

        }

        System.out.println(shop.toString());

    }

}
