package aplana.ru.task;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Homework9 {
    public static void main (String[] args) {
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int size = (int)scan.nextDouble();
        double array[] = new double[size];

        double sum = 0.0;
        System.out.println("Введите элементы массива отделенные пробелом с дробной частью через запятую");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextDouble();
            sum = sum + array[i];
        }
        DecimalFormat df = new DecimalFormat("###.##");
        double sr = sum / (double)size;
        System.out.println("Среднее арифметическое = " + df.format( sr));


        for (int i = 0; i < size; i++) {
            System.out.print(df.format(array[i] * sr) + " ");
        }
    }
}
