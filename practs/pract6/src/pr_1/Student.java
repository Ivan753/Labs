package pr_1;

public class Student {

    private String name;
    private int iDNumber;
    private int grade;

    public Student(String name, int iDNumber, int grade) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString(){
        return "id: "+this.iDNumber+"; name: "+this.name+"; grade: "+this.grade;
    }
}
