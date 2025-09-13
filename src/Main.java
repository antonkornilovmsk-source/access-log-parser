import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Проводим арифметические операции над двумя введенными числами.");
        System.out.println(" ");
        System.out.println("Введите первое число:");
        int number1 = new Scanner (System.in) .nextInt();

        System.out.println("Введите второе число:");
        int number2 = new Scanner (System.in) .nextInt();
        System.out.println(" ");

        // Вывод суммы введенных чисел
        int sum = number1 + number2;
        System.out.println("Сумма введенных чисел: " + sum);

        // Вывод разности введенных чисел
        int difference = number1 - number2;
        System.out.println("Разность введенных чисел: " + difference);

        // Вывод произведения введенных чисел
        int multiplication = number1 * number2;
        System.out.println("Произведение (результат умножения) введенных чисел: " + multiplication);

        // Вывод частного (деление) введенных чисел
        double quotient  = (double) number1 / number2;
        System.out.println("Частное (результат деления) введенных чисел: " + quotient);
    }
}