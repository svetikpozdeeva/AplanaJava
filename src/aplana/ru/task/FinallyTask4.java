package aplana.ru.task;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FinallyTask4 {

    public static void main(String[] args) {
        // вопрос
        System.out.println("Дайте ответ на  загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner scan = new Scanner(System.in);


        String correctAnswer = new String("Заархивированный вирус");
        String help = new String("Подсказка");
        int num = 1;
        boolean helpUsed = false;

        do {
            String userAnswer = scan.nextLine();
            //подсказка
            if (userAnswer.equalsIgnoreCase(help)) {
                helpUsed = true;
                if (num == 1) {
                    System.out.println("Подсказка: Это может нанести вред компьютеру");
                } else {
                    System.out.println("Подсказка уже недоступна");
                }
                System.out.println("Вводи ответ");
                userAnswer = scan.nextLine();
            }

            //попытки
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Правильно!");
                break;
            } else if (num != 3 && !helpUsed){
                System.out.println("Подумай еще!");
                System.out.println("Используй попытку # " + ++num);
            } else if (num == 3 || helpUsed){
                System.out.println("Обидно, приходи в другой раз");
                break;
            }

        }
        while (num <= 3);
    }
}
