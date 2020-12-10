package aplana.ru.task;

import java.util.regex.*;
import java.util.Scanner;

public class Homework13 {
    public static void main (String[] args) {
        System.out.println("Введите слова через пробел");

        Scanner scan = new Scanner(System.in);
        String [] array = scan.nextLine().split(" ");

        int counter = 0;
        for (String s : array) {
            if (Pattern.matches("[A-z]+", s)) {
                System.out.println(s);
                counter++;
            }
        }
        System.out.println("Количество слов = " + counter);
    }
}
