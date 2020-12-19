package aplana.ru.task;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class FinallyTask3 {
    public static void main (String[] args) {
        System.out.println("Введите количество строк n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] array = new String[n];

        int max = 0;
        String maxStr = null;
        System.out.println("Введите строку, затем нажмите Enter");

        for (int i = 0; i < n; i++) {
            array[i] = scan.next();
            char characters[] = array[i].toCharArray();
            Set uniques = new HashSet();
            for (char c: characters) {
                uniques.add(c);
            }
            if (max < uniques.size()) {
                max = uniques.size();
                maxStr = array[i];
            }
        }
        System.out.println("Строка с максимальным количеством различных символов: " + maxStr);
    }
}
