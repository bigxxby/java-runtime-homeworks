package contitional_statements_cycles;

public class Task_3 {
    public void isPrime(int num) {

        if (num <= 1) {
            System.out.println("Число не простое");
            return;
        }
        if (num <= 3) {
            System.out.println("Число простое");
            return;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Число не простое");
                return;
            }
        }
        System.out.println("Число простое");


    }
}
