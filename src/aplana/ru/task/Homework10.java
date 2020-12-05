package aplana.ru.task;

import java.util.Scanner;

public class Homework10 {
    public static void main (String[] args) {
        System.out.println("Введите размер матрицы, сначала количество строк, затем столбцов");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int array[][] = new int[row][col];

        System.out.println("Введите элементы матрицы, сначала элементы первой строки и так далее");
        for (int j = 0; j < col; j++) {
            array[0][j] = scan.nextInt();
            System.out.print(" " + array[0][j] * 3 + " ");
        }
            System.out.println();
    }
}
