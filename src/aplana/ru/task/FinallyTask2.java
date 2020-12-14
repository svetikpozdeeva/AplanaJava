package aplana.ru.task;

import java.text.DecimalFormat;
import java.util.Scanner;


public class FinallyTask2 {

    public static void main(String[] args) {
        // вопрос 1
        System.out.println("Введите уравнение, где участвуют цифры (от 0 до 9) и буква ‘x’ (пример уравнения x+5=7)");
        Scanner scan = new Scanner(System.in);
        char[] str = scan.next().toCharArray();
        String x = Character.toString(str[0]);
        String znak = Character.toString(str[1]);
        String y = Character.toString(str[2]);
        String z = Character.toString(str[4]);

        // результат
        int result;
        System.out.println("Результат:");

        if (x.equals("x")) {
            switch (znak) {
                case "-":
                    result = Integer.parseInt(z) + Integer.parseInt(y);
                    System.out.println("x равен " + result);
                    break;
                case "+":
                    result = Integer.parseInt(z) - Integer.parseInt(y);
                    System.out.println("x равен " + result);
                    break;
            }
        } else if (y.equals("x")) {
            switch (znak) {
                case "-":
                    result = Integer.parseInt(x) - Integer.parseInt(z);
                    System.out.println("x равен " + result);
                    break;
                case "+":
                    result = Integer.parseInt(z) - Integer.parseInt(x);
                    System.out.println("x равен " + result);
                    break;
            }
        } else if (z.equals("x")) {
            switch (znak) {
                case "-":
                    result = Integer.parseInt(x) - Integer.parseInt(y);
                    System.out.println("x равен " + result);
                    break;
                case "+":
                    result = Integer.parseInt(x) + Integer.parseInt(y);
                    System.out.println("x равен " + result);
                    break;
            }
        } else System.out.println("Вы ввели неверное уравнение");
    }
}
