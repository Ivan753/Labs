package pr_2;

import java.util.Arrays;
import pr_1.Student;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {


    public static void main(String[] args) {

        Student[] mass = new Student[10];

        for(int i = 0; i < 10; i++) {
            mass[i] = new Student(("Stu"+String.valueOf(10-i)), (int) Math.round(Math.random()*20), (int) Math.round(Math.random()*4)+1);
        }

        // сортировка массива
        Arrays.sort(mass, (new SortingStudentsByGPA()));

        // вывод отсортированного массива
        for(int i = 0; i < mass.length; i++) {
            System.out.println(mass[i].toString());
        }
    }

    @Override
    public int compare(Student obj1, Student obj2)
    {
        return obj1.getGrade() - obj2.getGrade();
    }

}
