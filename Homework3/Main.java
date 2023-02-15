package Homework3;

import Homework3.controller.Controller;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();

        System.out.println("Введите пожалуйста личные данные через пробел: ");
        System.out.println("ФИО, дата рождения(dd.mm.yyyy), номер телефона(10 цифр), пол(f или m)");

        String data = sc.nextLine();

        if(controller.checkData(data) == 7) {
            controller.writeDataInFile(data);
        }
    }
}