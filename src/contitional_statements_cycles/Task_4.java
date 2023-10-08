package contitional_statements_cycles;

import java.util.Scanner;

public class Task_4 {
    public void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для нахождения факториала");

        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Факториал можно определять только для неотрицательных!");
            return;
        }
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        System.out.println(res);

    }
}
