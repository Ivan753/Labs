package lab2_2;

public class Hand {

    private int strength;
    private int length;

    public Hand(int strength, int length) {
        this.strength = strength;
        this.length = length;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
