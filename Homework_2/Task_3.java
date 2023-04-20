/* К калькулятору из предыдущего дз добавить логирование.

Пример:
1 + 3 = 4
4 + 3 = 7

*/

package JavaCourse.Homework_2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Scanner;

public class Task_3 {

    private static Logger logger;

    private static void Init() throws SecurityException, IOException {
        logger = Logger.getLogger(Task_3.class.getName());
        FileHandler fileHandler = new FileHandler("calculate.log");
        logger.addHandler(fileHandler);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);
    }

    public static void main(String[] args) throws SecurityException, IOException {
        Scanner inConsole = new Scanner(System.in);
        Init();

        System.out.print("Введите первое число: ");
        int a = Integer.parseInt(inConsole.next());
        logger.info(String.format("Введено первое число: %d", a));

        System.out.print("Введите операцию(\"+\", \"-\", \"*\", \"/\"): ");
        String operation = inConsole.next();
        logger.info(String.format("Выбранна операция: %s", operation));

        System.out.print("Введите второе число: ");
        int b = Integer.parseInt(inConsole.next());
        logger.info(String.format("Введено второе число: %d", b));

        inConsole.close();
        switch (operation) {
            case "+":
                System.out.printf("%d %s %d = %d", a, operation, b, a + b);
                logger.warning(String.format("Подсчет выполнен: %d %s %d = %d", a, operation, b, a + b));
                break;
            case "-":
                System.out.printf("%d %s %d = %d", a, operation, b, a - b);
                logger.warning(String.format("Подсчет выполнен: %d %s %d = %d", a, operation, b, a - b));
                break;
            case "*":
                System.out.printf("%d %s %d = %d", a, operation, b, a * b);
                logger.warning(String.format("Подсчет выполнен: %d %s %d = %d", a, operation, b, a * b));
                break;
            case "/":
                System.out.printf("%d %s %d = %f", a, operation, b, (double) a / b);
                logger.warning(String.format("Подсчет выполнен: %d %s %d = %d", a, operation, b, (double) a / b));
                break;
        }
    }
}
