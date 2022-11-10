/* 
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/

package Homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter a non-empty string");
        Scanner scanner = new Scanner(System.in);
        while (input(scanner)){}
        scanner.close();
    }
    private static Boolean input(Scanner scanner) {
        String line = scanner.nextLine();
        if(line.isEmpty()){
            System.out.println("Enter a non-empty value!");
            return true;
        }
        else{
            System.out.println("Ready!");
            return false;
        }
    }
}