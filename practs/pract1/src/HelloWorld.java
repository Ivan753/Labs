import java.lang.System;

public class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello world");

        Book book = new Book("Достоевский", "Преступление и наказание");
        System.out.print(book.toString());

    }

}
