/* Реализовать простой калькулятор*/

package JavaCourse.Homework_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner inConsole = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = Integer.parseInt(inConsole.next());
        System.out.print("Введите операцию(\"+\", \"-\", \"*\", \"/\"): ");
        String operation = inConsole.next();
        System.out.print("Введите второе число: ");
        int b = Integer.parseInt(inConsole.next());
        inConsole.close();
        switch (operation) {
            case "+":
                System.out.printf("%d %s %d = %d", a, operation, b, a + b);
                break;
            case "-":
                System.out.printf("%d %s %d = %d", a, operation, b, a - b);
                break;
            case "*":
                System.out.printf("%d %s %d = %d", a, operation, b, a * b);
                break;
            case "/":
                System.out.printf("%d %s %d = %f", a, operation, b, (double) a / b);
                break;
        }
    }
}