package generics.task2;

public class Main {
    public static void main(String[] args) {
        Box<String , String> box = new Box<>("Box", "Runtime");
        System.out.println(box);
        Box<Integer, Boolean> sample2 = new Box<>(1, Boolean.TRUE);
        System.out.println(sample2);
    }
}