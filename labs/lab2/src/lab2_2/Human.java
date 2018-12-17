package lab2_2;

public class Human {

    private Head head;
    private Leg leg;
    private Hand hand;

    public Human(int shape, String colorEyes, int size, int length, int strength, int length1) {
        this.head = new Head(shape, colorEyes);
        this.leg = new Leg(size, length);
        this.hand = new Hand(strength, length1);
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
