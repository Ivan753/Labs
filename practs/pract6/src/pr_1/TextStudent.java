package pr_1;

public class TextStudent {

    public static void main(String[] args) {

        Student[] mass = new Student[10];

        for(int i = 0; i < 10; i++) {
            mass[i] = new Student(("Stu"+String.valueOf(10-i)), (int) Math.round(Math.random()*20), 5);
        }

        // вывод исходного массива
        for(int i = 0; i < mass.length; i++) {
            System.out.println(mass[i].toString());
        }

        System.out.println();

        // сортировка
        qSort(mass, 0, mass.length - 1);

        // вывод отсортированного массива
        for(int i = 0; i < mass.length; i++) {
            System.out.println(mass[i].toString());
        }

    }


    public static void qSort(Student[] mass, int l, int r){

        int m = l + (r-l)/2;
        int i = l;
        int j = r;

        while(i <= j) {

            while (mass[i].getiDNumber() < mass[m].getiDNumber()) {
                i++;
            }

            while (mass[j].getiDNumber() > mass[m].getiDNumber()) {
                j--;
            }

            if (i <= j) {
                Student tmp = mass[i];
                mass[i] = mass[j];
                mass[j] = tmp;
                i++;
                j--;
            }


        }

        if(i < r) {
            qSort(mass, i, r);
        }
        if(l < j){
            qSort(mass, l, j);
        }

    }

}
