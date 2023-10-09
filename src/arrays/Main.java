package arrays;

public class Main {
    //1 Вывести первые 3 элемента массива (Вывести первые 3 элемента массива используя цикл for).
    //
    //2 Вывести первую половину массива (Вывести первую первую половину элементов массива при помощи цикла for). Реализация задачи должна работать при любом чётном количестве элементов.
    //
    //3 Вывести вторую половину массива (Вывести вторую половину элементов массива при помощи цикла for). Реализация задачи должна работать при любом чётном количестве элементов.
    //
    //4 Вывести все элементы кроме первого и последнего.
    //
    //5 Вывести последние 3 элемента массива (Для массива [7, -3, 9, -11, 18, 99, 2, 11] вывод должен быть таким: 99, 2, 11)
    //
    //6 Вывести чётные элементы массива по порядку (Вывести только чётные элементы массива по порядку (каждый второй элемент). Необходимо будет вывести второй, четвёртый, шестой и т.д. элементы. Позиции (индексы) для необходимых элементов: 1, 3, 5...n (постоянное увеличение на 2).
    //
    //7 Вывести количество положительных и отрицательных элементов (Необходимо определить количество положительных и отрицательных элементов в массиве и вывести его). В реализации задачи понадобится определить 2 переменные для хранения количества элементов: Одна переменная для хранения количества положительных элементов, допустим positiveCount. Вторая для хранения количества отрицательных элементов, допустим negativeCount. Названия переменных можно выбирать на своё усмотрение.
    //
    //8 Вывести элементы массива которые больше предыдущего (Необходимо вывести все элементы массива которые больше чем впереди стоящий). Для массива [7, -3, 9, -11, 18, 99, 2, 11] вывод должен быть таким: 9, 18, 99, 11.
    //
    //9 Найти максимальный и минимальный элементы массива (Необходимо определить максимальный и минимальный элементы в массиве и вывести их).
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};

        //1
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }

        //2
        for (int i = 0; i < array.length / 2; i++) {
            System.out.println(array[i]);
        }
        //3
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //4
        for (int i = 1; i < array.length; i++) {
            System.out.println(array[i]);

        }
        //5
        for (int i = array.length - 3; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //6
        for (int i = 1; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
        //7
        int countP = 0;
        int countN = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < 0) {
                countN++;
            } else {
                countP++;
            }
        }
        System.out.println(countP + " " + countN);

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                System.out.println(array[i + 1]);
            }
        }
        //9
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > max) {
                max = array[i];
            }
            if (array[i] < array[i - 1] && array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(max + " " + min);


    }
}
