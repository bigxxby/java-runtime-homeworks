package contitional_statements_cycles;

import java.util.Scanner;

public class Task_6 {
    public void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = scanner.nextInt();
        System.out.println("Введите второе число");
        int second = scanner.nextInt();
        System.out.println("Введите оператор");
        String op = scanner.next();
        switch (op) {
            case "+":
                System.out.println("Сумма = " + first + second);
                break;
            case "-":
                System.out.println("Вычитание = " + (first - second));
                break;
            case "*":
                System.out.println("Умножение = " + first * second);
                break;
            case "/":
                System.out.println("Деление = " + first / second);
                break;
            default:
                throw new IllegalStateException("Неожиданный оператор: " + op);
        }


    }
}
