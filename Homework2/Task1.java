package Homework2;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        inputNumber();
    }

    public static float inputNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input float number:");
        float number = 0;

        if (scanner.hasNextFloat() == false) {
            System.out.println("You entered a non-fractional number");
            inputNumber();
            return number;
        } else {
            number = scanner.nextFloat();
            System.out.println("You entered a fractional number: " + number);
            scanner.close();
            return number;
        }
    }
}