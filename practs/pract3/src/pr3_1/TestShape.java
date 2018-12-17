package pr3_1;

public class TestShape {

    public static void main(String[] args) {

        Circle[] mass = new Circle[3];

        mass[0] = new Circle(5, "#334455", true);
        mass[1] = new Circle(3, "#334455", true);
        mass[2] = new Circle(5, "#334455", true);

        System.out.println(mass[0].equal(mass[1]));
        System.out.println(mass[0].equal(mass[2]));

    }

}
