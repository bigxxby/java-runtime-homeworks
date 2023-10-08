package contitional_statements_cycles;

public class Task_5 {
    public void sumOfThree() {
        int res = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                res += i;
            }
        }
        System.out.println(res);
    }
}
