import java.lang.System;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[10];

        System.out.print("First task\n");

        // --------------- first task
        for(int i = 0; i < a.length; i++){
            a[i] = i*i;
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");

        int i = 0;

        while(i < a.length){
            System.out.print(a[i] + " ");
            i++;
        }
        System.out.print("\n");

        i = 0;

        do{
            System.out.print(a[i] + " ");
            i++;
        }while(i < a.length);
        System.out.print("\nSecond task\n");

        // ------------------- second task

        for(int j = 0; j < args.length; j++){
            System.out.print(args[j] + " ");
        }
        System.out.print("\nThird task\n");

        // ------------------- third task

        for(int j = 1; j <= 10; j++){
            System.out.print((double)1/j + " ");
        }
        System.out.print("Fourth task\n");

        // ------------------- fourth

        Random rand = new Random();

        for(int j = 0; j < 10; j++){
            a[j] = rand.nextInt();
            System.out.print(a[j] + " ");
        }
        System.out.print("\n");

        Arrays.sort(a);

        for(int j = 0; j < 10; j++){
            System.out.print(a[j] + " ");
        }
        System.out.print("\nFifth task\n");

        // ----------------------- fifth

        System.out.print(factorial(5));

    }

    public static int factorial(int n){

        int res = 1;

        if(n > 1) {
            res = n*factorial(n - 1);
        }

        return res;
    }
}
