package aplana.ru.task;
import java.util.Scanner;

public class Homework4 {
    public static void main (String[] args) {
        System.out.println("Введите три числа через пробел");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        double sr = (double)(x + y + z)/3;
        System.out.println("Среднее арифметическое чисел = " + sr);

        int halfSr = (int)Math.floor(sr/2);
        if (halfSr > 3) {
            System.out.println("Программа выполнена корректно");
        } else {
            System.out.println("Половина от среднего равна " + halfSr);
        }
    }
}

