package aplana.ru.task;

import java.util.Scanner;

public class Homework8 {
    public static void main (String[] args) {
        System.out.println("Введите любое целое положительное число n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int sum = 0;
        // по условию задачи не понятно, должно ли число n суммироваться, если оно нечетное. Сделала так, что суммируется
        for (int i = 1; i <= n; i = i + 2) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
