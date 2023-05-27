/* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Добавить функции:
1) Добавление номера
2) Вывод всего
Пример:
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите:
1) Добавление номера
1) Вывод всего
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите:
1) Добавление номера
1) Вывод всего
Я: 2
Иванов: 1242353, 547568
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {
    private Map<String, String> phoneBook;

    public Task_1() {
        phoneBook = new HashMap<>();
    }

    public void addNumber(String name, String number) {
        phoneBook.put(name, number);
    }

    public void displayAll() {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Task_1 phoneBook = new Task_1();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите 1 для добавления номера");
                System.out.println("Введите 2 для вывода всего");

                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("Введите фамилию:");
                    String name = scanner.next();
                    System.out.println("Введите номер:");
                    String number = scanner.next();
                    phoneBook.addNumber(name, number);
                } else if (choice == 2) {
                    phoneBook.displayAll();
                } else {
                    break;
                }
            }
        }
    }
}