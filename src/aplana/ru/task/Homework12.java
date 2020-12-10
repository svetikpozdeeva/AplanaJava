package aplana.ru.task;

import java.util.Scanner;

public class Homework12 {
    public static void main (String[] args) {
        String x = "I like Java!!!";
        if (x.contains("Java") && x.startsWith("I like") && x.endsWith("!!!")) {
            System.out.println(x.toUpperCase());
        }
        System.out.println(x.substring(7,11).replace('a', 'o'));
    }
}
