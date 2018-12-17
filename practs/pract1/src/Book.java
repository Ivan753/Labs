public class Book{

    public String author;
    public String name;

    Book(String a, String b){
        author = a;
        name = b;
    }

    public String toString(){
        return "Автор: "+author+"\nНазвание: "+name;
    }
}