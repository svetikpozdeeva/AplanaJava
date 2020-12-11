package aplana.ru.task;

import java.util.Random;

public class Homework14 {
    public static void main (String[] args) {
        int[] array = new int[15];
        int max = -20;
        int min = 20;
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(20 - (-20)) + (-20);
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            System.out.println(array[i]);
        }
        System.out.println("Максимальный элемент массива = " + max);
        System.out.println("Минимальный элемент массива = " + min);
        if (Math.abs(max) > Math.abs(min)) {
            System.out.println("Максимальный элемент по модулю из min и max = " + Math.abs(max));
        } else {
            System.out.println("Максимальный элемент по модулю из min и max = " + Math.abs(min));
        }
    }
}
