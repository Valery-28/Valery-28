package massive;


import java.util.Random;

/*
Создать двумерный квадратный массив размера n. Заполнить его случайными числами таким образом:
○	числа по диагонали равны 0;
○	вверху и снизу от пересечения диагоналей находятся только положительные числа;
○	слева и справа от пересечения диагоналей находятся только отрицательные числа;
○	Вывести массив на экран.
○	Найти сумму всех элементов
○	Найти среднее арифметическое всех элементов, которые больше суммы всех элементов
Пример:
0  4  5  5  3  8  0
-2  0  5  6  3  0 -4
-2 -8  0  6  0 -1 -2
-5 -9 -2  0 -9 -7 -3
-6 -2  0  1  0 -1 -5
-2  0  3  5  2  0 -8
 0  4  2  9  1  3  0

Сумма всех элементов: -3
Среднее арифметическое всех элементов больше -3: 1.6579

 */
public class Task13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(3, 6);
        int[][] array = new int[n][n];
        int sum = 0;
        double average = 0;
        int count = 0;
        int i;
        int j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                array[i][j] = rand.nextInt(-9, 9);
                if (i == j) {
                    array[i][j] = 0;
                }
                if (i < j && array[i][j] <= 0) {
                    array[i][j] = rand.nextInt(1, 9);
                } else if (i > j && array[i][j] >= 0) {
                    array[i][j] = rand.nextInt(-9, -1);
                }
                if (array[i][j] >= 0) {
                    System.out.print(" " + array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
                sum += array[i][j];
            }
            System.out.println();
        }
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                if (sum < array[i][j]) {
                    count++;
                    average += array[i][j];
                }
            }
        }

        average = average / count;
        System.out.println("Сумма всех чисел в матрице: " + sum);
        if (count == 0) {
            System.out.println("Чисел больше суммы нет");
            return;
        }
        System.out.println("Среднее арифметическое всех элементов больше " + sum + ": " + average);
    }
}