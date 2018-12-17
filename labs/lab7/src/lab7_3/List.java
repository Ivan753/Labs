package lab7_3;

public class List {

    private Node head;
    private Node current;

    public List() {
        this.head = null;
        this.current = null;
    }

    public void add(int a){

        Node tmp = new Node(this.current, a);


        if(!(this.head instanceof Node)) {
            this.head = tmp;
        }

        this.current = tmp;


    }

    public void next(){
        this.current = this.current.getNext();
    }



    public int showValue(){
        return this.current.getValue();
    }


}

class Node{

    private Node next;
    private int value;

    public Node(Node next, int value) {
        this.next = next;
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public Node getNext() {
        return this.next;
    }
}

class Main{

    public static void main(String[] args){


        List state = new List();

        state.add(5);
        state.add(10);
        state.add(16);
        state.add(29);

        for(int i = 0; i < 4; i++) {

            System.out.println(state.showValue());
            state.next();

        }

    }

}
