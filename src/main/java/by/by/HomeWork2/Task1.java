//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
// введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
// необходимо повторно запросить у пользователя ввод данных.

package by.by.HomeWork2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(InputFloat("Введите вещественное число: "));
    }

    static public float InputFloat(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextFloat();
            } catch (InputMismatchException ex) {
                scanner.next();
                System.out.println("Ошибка ввода!!!");
            }
        }
    }

}
