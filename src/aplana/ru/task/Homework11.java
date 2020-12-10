package aplana.ru.task;

import java.util.Scanner;

public class Homework11 {
    public static void main (String[] args) {
        System.out.println("Введите первое число");
        Scanner scan = new Scanner(System.in);
        String x = scan.next();

        System.out.println("Введите второе число");
        int y = scan.nextInt();

        int z = Integer.parseInt(x);
        System.out.println("Максимальное число " + Math.max(z, y));
        double min = (double)Math.min(z, y);
        System.out.println("Минимальное число " + min);
    }
}
