package pr_3;

import pr_1.Student;
import pr_2.SortingStudentsByGPA;

import java.util.Arrays;

public class TextStudent {

    public static void main(String[] args) {


        Student[] mass = new Student[20];
        Student[] mass1 = new Student[10];
        Student[] mass2 = new Student[10];

        for (int i = 0; i < 10; i++) {
            mass1[i] = new Student(("Stu" + String.valueOf(10 - i)), (int) Math.round(Math.random() * 20), (int) Math.round(Math.random() * 4) + 1);
        }

        for (int i = 0; i < 10; i++) {
            mass2[i] = new Student(("Stu" + String.valueOf(10 - i)), (int) Math.round(Math.random() * 20), (int) Math.round(Math.random() * 4) + 1);
        }

        // сортировка массива
        Arrays.sort(mass1, (new pr_2.SortingStudentsByGPA()));
        Arrays.sort(mass2, (new pr_2.SortingStudentsByGPA()));

        merge(mass, mass1, mass2);

        // вывод отсортированного результата
        for(int i = 0; i < mass.length; i++) {
            System.out.println(mass[i].toString());
        }

    }

    public static void merge(Student arr[], Student mass1[], Student mass2[])
    {
        // Find sizes of two subarrays to be merged
        int n1 = mass1.length;
        int n2 = mass2.length;
        int m = mass1.length;
        int l = 0;

        /* Create temp arrays */
        Student L[] = mass1;
        Student R[] = mass2;

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while(i < n1 && j < n2)
        {
            if(L[i].getGrade() <= R[j].getGrade())
            {
                arr[k] = L[i];
                i++;

            }else{

                arr[k] = R[j];
                j++;

            }

            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}
