package lab4_1;

public class NameableTest {

    public static void main(String[] args) {

        People p1 = new People("Mark");
        People p2 = new People("Petya");
        People p3 = new People("Dasha");

        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());

    }

}
