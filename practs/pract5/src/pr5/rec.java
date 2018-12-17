package pr5;
import java.math.*;

public class rec {

    public static void recursion(int n, int g){

        if(n!=1) recursion(n - 1, g);

        for(int i = 0; i < n; i++){
            if(n + i < g) System.out.print(" "+n);
        }

    }

    public static int sum(int n) {

        if(n > 0) {
            return n % 10 + sum(n / 10);
        }else{
            return 0;
        }

    }


    public static int counter(int k, int s){

        if(k == 0){
            if(s == 0){
                return 1;
            }else{
                return 0;
            }
        }else{
            if(s < 0){
                return 0;
            }
        }

        int count = 0;
        int c = k == 0 ? 1 : 0;

        for(int i = c; i < 10; i++){
            count += counter(k-1, s-i);
        }

        return count;

    }

    public static void main(String[] args) {
        // 1
        recursion(4, 4);

        System.out.println();

        // 4
        System.out.println(counter(2, 10));

        // 5
        System.out.println(sum(1234));
    }

}
