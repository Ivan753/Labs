package pr2_2n3;
import java.lang.System;

public class Library {

    public static Book[] b = new Book[3];

    public static void main(String[] args) {

        b[0] = new Book(1, "Lala", "SuperBoook", 1988, "Invite", 510, "Its very cool book!");
        b[1] = new Book(2, "Lala", "BestBoook", 2008, "Invite", 4490, "Hello my dear friend! You need in this book!");
        b[2] = new Book(3, "Bob", "Baranka", 1989, "Blue", 200, "Don't worry, Sell it!");

        search("Lala");     // Запуск поиска
    }

    public static void search(String str){

        for(int i = 0; i < b.length; i++){

            if((b[i].getAuthor()).equals(str)) {
                System.out.println("Author: " + b[i].getAuthor() + "\nName: " + b[i].getName() + "\nDescription: " + b[i].getDescription()+"\n");
            }

        }

    }
}
