package pr2_2n3;

public class Book {

    private int reg_num;
    private String author;
    private String name;
    private int year;
    private String creater;
    private int page;
    private int num_tick;
    private boolean available;
    private String description;


    public Book(int reg_num, String author, String name, int year, String creater, int page, String description) {
        this.reg_num = reg_num;
        this.author = author;
        this.name = name;
        this.year = year;
        this.creater = creater;
        this.page = page;
        this.num_tick = 0;
        this.available = true;
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
