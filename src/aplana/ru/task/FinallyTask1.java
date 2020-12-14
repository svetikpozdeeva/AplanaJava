package aplana.ru.task;

import java.util.Scanner;
import java.text.DecimalFormat;

public class FinallyTask1 {
    private static int y;

    public static void main(String[] args) {
        // вопрос 1
        System.out.println("Введите текущий курс рубля к доллару (дробная часть через запятую)");
        Scanner scan = new Scanner(System.in);
        double kurs = scan.nextDouble();
        // вопрос 2
        System.out.println("Введите количество рублей");
        double rub = scan.nextDouble();

        // результат
        System.out.println("Результат:");
        if (kurs == 0  || rub == 0) {
            System.out.println("Вы ввели 0");
        } else {
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println("Итого: " + df.format(rub / kurs) + " долларов");
        }
    }
}
