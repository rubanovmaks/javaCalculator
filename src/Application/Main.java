/**
 * @author rubanovmaks
 */
package Application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int value1;
        value1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int value2;
        value2 = scanner.nextInt();
        int operator;
        int result;
        System.out.println("Введите оператор:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Остаток от деления");
        System.out.println("6. Проверка на равенство");
        System.out.println("7. Проверка на неравенство");
        operator = scanner.nextInt();
        switch (operator) {
            case 1:
                result = value1 + value2;
                System.out.println("Результат: " + result);
                break;
            case 2:
                result = value1 - value2;
                System.out.println("Результат: " + result);
                break;
            case 3:
                result = value1 * value2;
                System.out.println("Результат: " + result);
                break;
            case 4:
                result = value1 / value2;
                System.out.println("Результат: " + result);
                break;
            case 5:
                result = value1 % value2;
                System.out.println("Результат: " + result);
                break;
            case 6:
                boolean result1;
                result1 = value1 == value2;
                System.out.println("Результат: " + result1);
                break;
            case 7:
                boolean result2;
                result2 = value1 != value2;
                System.out.println("Результат: " + result2);
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
