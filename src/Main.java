import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем первое число
        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();

        // Запрашиваем второе число
        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();

        // Сумма (int)
        int sum = number1 + number2;

        // Разность (int)
        int difference = number1 - number2;

        // Произведение (int)
        int product = number1 * number2;

        // Частное (double)
        double quotient = (double) number1 / number2;

        // Выводим результаты в консоль
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        if (number2 != 0) {
            System.out.println("Частное: " + quotient);
        }

        // Закрываем объект Scanner
        scanner.close();
    }
}