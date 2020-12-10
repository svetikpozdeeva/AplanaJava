package aplana.ru.task;

import java.util.Scanner;

public class Homework10 {
    public static void main (String[] args) {
        System.out.println("Введите размер матрицы, сначала количество строк, затем столбцов");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int array[][] = new int[row][col];
        String str = "";

        System.out.println("Введите элементы матрицы через запятую, сначала элементы первой строки и так далее");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = scan.nextInt();
                System.out.print(array[i][j]);
                if (i == 0) {
                    str = str + " " + array[0][j] * 3;
                }
            }
            System.out.println();
        }
        System.out.println("Элементы первой строки, умноженные на 3: " + str);

    }
}
