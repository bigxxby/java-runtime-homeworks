import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.next();
        System.out.println("Введите пароль");
        String password = scanner.next();

        getUsers();
        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);
        System.out.println("Вход успешен!");


    }

    public static User[] getUsers() {
        User user1 = new User("John", "jhon@gmail.com", "pass", 24);
        User user2 = new User("Mark", "Mark@gmail.com", "pppps", 20);
        User user3 = new User("Ann", "Ann@gmail.com", "pas", 16);
        User user4 = new User("Alex", "Alex@gmail.com", "pas4", 25);

        return new User[]{user1, user2, user3, user4};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();

        for (User user : users) {
            if (Objects.equals(login, user.getName()) && Objects.equals(password, user.getPassword())) {
                System.out.println("Вы вошли, проверка возраста...");
                return user;
            }
        }

        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Доступ запрещен, вам меньше 18 лет!");
        }
    }
}