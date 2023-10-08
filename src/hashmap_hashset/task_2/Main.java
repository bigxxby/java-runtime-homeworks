import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Student> hashSet = new HashSet<>();
        System.out.println("Введите ФИО, Группу , ID студента.");
        while (true) {
            String input = scanner.nextLine(); // Марья иванова , ГР-4 , 12316542;
            if (input.equals("end")) {
                break;
            }
            String[] arr = input.split("\\s*,\\s*"); // Разделяем строку с помощью метода "Split" используем регулярные выражения

            if (arr.length != 3) {  // если вдруг пользователь вводит больше аргуметов выбасываем ошибку

                throw new RuntimeException("Вы ввели некорректоное количество аргументов!");
            }
            String name = arr[0].trim();   // имя
            String group = arr[1].trim();  // группа
            String ID = arr[2].trim();     // ИД
            hashSet.add(new Student(name, group, ID));
            System.out.println("Студент добавлен, введите 'end' для завершения.");


        }
        System.out.println("Список всех студентов - ");
        for (Student s : hashSet
        )
            System.out.println(s.toString());
    }
}