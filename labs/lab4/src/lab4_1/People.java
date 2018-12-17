package lab4_1;

public class People implements Nameable {

    private String name;

    public People(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
