package aplana.ru.task;

public class Homework3 {
    public static void main(String arg[]) {
        int[] myArray = {23, 67, 65, 432, 33};

        //смена первого и последнего элемента в массиве
        int a = myArray[0];
        int first = myArray[0] = myArray[myArray.length - 1];
        int last = myArray[myArray.length - 1] = a;

        int middle = Math.round(myArray[myArray.length / 2]);
        int sum  = first + middle;
        System.out.print("Сумма первого и среднего элемента " + sum);
    }
}
