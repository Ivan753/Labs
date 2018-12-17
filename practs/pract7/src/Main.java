import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayDeque<Integer> catrs1 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> catrs2 = new ArrayDeque<Integer>();

        Scanner in = new Scanner(System.in);
        System.out.print("Input Firs's carts: ");
        String fcarts = in.nextLine();

        System.out.print("Input Second's carts: ");
        String scarts = in.nextLine();


        for(int i = 0; i < fcarts.length(); i++){
            if(fcarts.charAt(i) == ' ') continue;
            catrs1.addFirst(Integer.valueOf(String.valueOf(fcarts.charAt(i))));
        }

        for(int i = 0; i < scarts.length(); i++){
            if(fcarts.charAt(i) == ' ') continue;
            catrs2.addFirst(Integer.valueOf(String.valueOf(scarts.charAt(i))));
        }


        int winner = 0; // исход игры: 1 - выиграл первый, 2 - выиграл второй, 3 - исчерпан лимит ходов

        boolean t = true; // признак действия игры
        int i = 0; // количество шагов

        // текущие карты игроков
        int cart1;
        int cart2;

        while(t){

            if(i > 106){
                winner = 3;
                t = false;
                break;
            }

            if(catrs1.isEmpty()){
                winner = 2;
                t = false;
                break;
            }

            if(catrs2.isEmpty()){
                winner = 1;
                t = false;
                break;
            }

            cart1 = catrs1.pollLast();
            cart2 = catrs2.pollLast();

            cart1 = cart1 == 0? 10 : cart1;
            cart2 = cart2 == 0? 10 : cart2;

            if(cart1 > cart2){
                catrs1.addFirst(cart1);
                catrs1.addFirst(cart2);
            }

            if(cart1 < cart2){
                catrs2.addFirst(cart2);
                catrs2.addFirst(cart1);
            }

            if(cart1 == cart2){
                catrs1.addFirst(cart1);
                catrs2.addFirst(cart2);
            }

            i++;

        }

        String res = "";

        switch(winner){
            case 1: res = "first "+i; break;
            case 2: res = "second "+i; break;
            case 3: res = "botva"; break;
            default: res ="error"; break;
        }

        System.out.println(res);

    }

}
