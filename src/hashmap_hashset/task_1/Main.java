package hashmap_hashset;

import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook(new HashMap<>());       //Создание мапы
        Contact Andrey = new Contact("Andey", 123213);  // Контакт Андрей
        Contact Misha = new Contact("Миша", 332451510);
        phoneBook.addContactToGroup("Family", Misha);
        phoneBook.addContactToGroup("Family", Andrey);      // Добавили в группу Семья Андрея
        phoneBook.showPhonebook();                                   // Вывести на экран Книгу
        phoneBook.removeFromGroupContact("Family", Andrey); // Удалили Андрея из Семьи
        phoneBook.showPhonebook();                                   ///Вывести на экран книгу
        Contact Vasya = new Contact("Vasya", 213);       //  Контакт Вася
        phoneBook.addContactToGroup("Work", Vasya);         //Добавили в группу Работа Васю
        phoneBook.removeFromGroupContact("Family", Misha);
        phoneBook.showPhonebook();                                   ///Вывсети на экран книгу
        phoneBook.removeFromGroupContact("Family", Misha); // Попытка удалить не существующий контакт в группе
        phoneBook.addContactToGroup("Family", Vasya);      // Добавление контакта сразу в несолько групп
        phoneBook.showPhonebook();                                    ///Вывесети на экран книгу
        phoneBook.findContact(Vasya);
    }
}