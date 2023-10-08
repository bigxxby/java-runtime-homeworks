package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> listOfTasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean condiditon = true;
        while (condiditon) {


            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            int next = scanner.nextInt();
            switch (next) {
                case 1:
                    System.out.println("Введите задачу для планирования:");
                    String add = scanner.next();
                    listOfTasks.add(add);
                    break;
                case 2:
                    int count = 0;
                    System.out.println("Список задач: ");
                    for (String l : listOfTasks) {
                        System.out.println(++count + ": " + l);

                    }
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Введите номер задачи");
                    int del = scanner.nextInt();
                    listOfTasks.remove(del);
                    break;
                case 0:
                    condiditon = false;
                    break;

            }
        }
    }

}
