package lab2_3;

public class Book {

    private String author;
    private String name;
    private int year;
    private int paper;
    private String producer;

    public Book(String author, String name, int year, int paper, String producer) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.paper = paper;
        this.producer = producer;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPaper() {
        return paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
