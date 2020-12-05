package aplana.ru.task;

import java.util.Scanner;

public class Homework7 {
    public static void main (String[] args) {
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int array[] = new int[size];

        int x = 4;
        int y = 7;
        int z = 3;

        System.out.println("Введите элементы массива");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
            if (array[i] == x || array[i] == y || array[i] == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
