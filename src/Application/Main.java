/**
 * @author rubanovmaks
 */
package Application;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Обьявляем обьекты
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // Обьявляем переменные
        int value1 = 0;
        int value2 = 0;
        byte operator;
        int result;
        byte question;
        byte question2;
        System.out.println("Выберите действие:");
        System.out.println("1. Ввести число");
        System.out.println("2. Дать выбор компьютеру");
        question = scanner.nextByte();
        switch (question) {
            case 1:
                System.out.println("Введите число:");
                value1 = scanner.nextInt();
                break;
            case 2:
                value1 = random.nextInt();
                break;
            default:
                System.out.println("error");
                System.out.println();
                System.out.println("Created by rubanovmaks");
                break;
        }
        System.out.println("Выберите действие:");
        System.out.println("1. Ввести число");
        System.out.println("2. Дать выбор компьютеру");
        question2 = scanner.nextByte();
        // Проверка введенной команды
        switch (question2) {
            case 1:
                System.out.println("Введите число:");
                value2 = scanner.nextInt();
                break;
            case 2:
                value2 = random.nextInt();
                break;
            default:
                System.out.println("error");
                System.out.println();
                System.out.println("Created by rubanovmaks");
                break;
        }
        System.out.println("Введите оператор:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Остаток от деления");
        System.out.println("6. Проверка на равенство");
        System.out.println("7. Проверка на неравенство");
        operator = scanner.nextByte();
        // Проверка введенного оператора
        switch (operator) {
            case 1:
                result = value1 + value2;
                System.out.println("Результат: " + result);
                System.out.println();
                System.out.println("Created by rubanovmaks");
                break;
            case 2:
                result = value1 - value2;
                System.out.println("Результат: " + result);
                System.out.println();
                System.out.println("Created by rubanovmaks");
                break;
            case 3:
                result = value1 * value2;
                System.out.println("Результат: " + result);
                System.out.println();
                System.out.println("Created by rubanovmaks");
                break;
            case 4:
                result = value1 / value2;
                System.out.println("Результат: " + result);
                System.out.println();
                System.out.println("Created by rubanovmaks");
                break;
            case 5:
                result = value1 % value2;
                System.out.println("Результат: " + result);
                System.out.println();
                System.out.println("Created by rubanovmaks");
                break;
            case 6:
                boolean result1;
                result1 = value1 == value2;
                System.out.println("Результат: " + result1);
                System.out.println();
                System.out.println("Created by rubanovmaks");
                break;
            case 7:
                boolean result2;
                result2 = value1 != value2;
                System.out.println("Результат: " + result2);
                System.out.println();
                System.out.println("Created by rubanovmaks");
                break;
            default:
                System.out.println("error");
                System.out.println();
                System.out.println("Created by rubanovmaks");
                break;
        }
    }
}
