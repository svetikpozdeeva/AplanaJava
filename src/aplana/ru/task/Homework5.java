package aplana.ru.task;

import java.util.Scanner;

public class Homework5 {
    public static void main (String[] args) {
        System.out.println("Введите два числа и любой знак ‘+’, ‘-’, ‘*’ или ‘/’ через пробел");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        String z = scan.next();

        switch (z) {
            case "+": System.out.println(x + y);
                break;
            case "-": System.out.println(x - y);
                break;
            case "*": System.out.println(x * y);
                break;
            case "/": System.out.println((double)(x) / (double)(y));
                break;
            default: System.out.println("Что-то не то ввели");
        }
    }
}
