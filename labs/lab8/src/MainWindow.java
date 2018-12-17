import java.io.*;
import java.util.Scanner;

public class MainWindow {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("file.txt", false))
        {
            // запись всей строки

            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();

            writer.write(text);
            // запись по символам
            writer.append('\n');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }



        try(FileReader reader = new FileReader("file.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);

            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


        try(FileWriter writer = new FileWriter("file.txt", false))
        {
            // запись всей строки

            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();

            writer.write(text);
            // запись по символам
            writer.append('\n');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


        try(FileWriter writer = new FileWriter("file.txt", true))
        {
            // запись всей строки

            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();

            writer.write(text);
            // запись по символам
            writer.append('\n');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }



    }

}
