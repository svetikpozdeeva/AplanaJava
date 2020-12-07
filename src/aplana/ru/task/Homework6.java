package aplana.ru.task;

import java.util.Scanner;

public class Homework6 {
    private static int x;
    private static int y;

    public static void main(String[] args) {
        // вопрос 1
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        // вопрос 2 в зависимости от выбора пользователя в первом вопросе
        if (x == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - унция, 3 - фунт");
            Scanner scan1 = new Scanner(System.in);
            y = scan1.nextInt();
        } else if (x == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            Scanner scan2 = new Scanner(System.in);
            y = scan2.nextInt();
        } else {
            System.out.println("Вы не выбрали что переводить");
        }

        // вопрос 3
        System.out.println("Введите число");
        Scanner scan3 = new Scanner(System.in);
        int z = scan3.nextInt();

        // результат
        System.out.println("Результат:");
        if (x == 1) {
            switch (y) {
                case 1:
                    double kilo = z;
                    double un = z * 35.274;
                    double funt = z * 2.205;
                    System.out.println("Колограммы:" + kilo);
                    System.out.println("Унции:" + un);
                    System.out.println("Фунты:" + funt);
                    break;
                case 2:
                    kilo = z * 0.0283;
                    un = z;
                    funt = z * 0.0625;
                    System.out.println("Колограммы:" + kilo);
                    System.out.println("Унции:" + un);
                    System.out.println("Фунты:" + funt);
                    break;
                case 3:
                    kilo = z * 0.454;
                    un = z * 16;
                    funt = z;
                    System.out.println("Колограммы:" + kilo);
                    System.out.println("Унции:" + un);
                    System.out.println("Фунты:" + funt);
                    break;
            }
        } else if (x == 2) {
            switch (y) {
                case 1:
                    double metr = z;
                    double mil = z * 1.0006;
                    double yard = z * 1.094;
                    double fut = z * 3.281;
                    System.out.println("Метры:" + metr);
                    System.out.println("Мили:" + mil);
                    System.out.println("Ярды:" + yard);
                    System.out.println("Футы:" + fut);
                    break;
                case 2:
                    metr = z * 1609.34;
                    mil = z;
                    yard = z * 1760;
                    fut = z * 5280;
                    System.out.println("Метры:" + metr);
                    System.out.println("Мили:" + mil);
                    System.out.println("Ярды:" + yard);
                    System.out.println("Футы:" + fut);
                    break;
                case 3:
                    metr = z * 0.9144;
                    mil = z * 1.0006;
                    yard = z;
                    fut = z * 3;
                    System.out.println("Метры:" + metr);
                    System.out.println("Мили:" + mil);
                    System.out.println("Ярды:" + yard);
                    System.out.println("Футы:" + fut);
                    break;
                case 4:
                    metr = z * 0.3048;
                    mil = z * 1.0002;
                    yard = z * 0.3333;
                    fut = z;
                    System.out.println("Метры:" + metr);
                    System.out.println("Мили:" + mil);
                    System.out.println("Ярды:" + yard);
                    System.out.println("Футы:" + fut);
                    break;
            }
        }
    }
}
