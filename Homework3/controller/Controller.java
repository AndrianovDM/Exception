package Homework3.controller;

import Homework3.data.Data;
import Homework3.data.Exception;
import Homework3.data.FileService;

public class Controller {

    Exception exception = new Exception();
    Data data = new Data();

    FileService fileService = new FileService();
    public int checkData(String dataBase) {
        String[] dataArray = data.getArrayOfStrings(dataBase);
        int count = 0;
        try {
            exception.checkDataOnCountOfMembers(dataArray, 6);
            count++;
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Введено больше данных!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Введено меньше данных!");
        }
        try {
            exception.checkDataOnSurnameFormat(dataArray);
            count++;
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректно введена фамилия!");
        }
        try {
            exception.checkDataOnPatronymicsFormat(dataArray);
            count++;
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректно введено отчество!");
        }
        try {
            exception.checkDataOnBirthDateFormat(dataArray);
            count++;
        } catch (NumberFormatException e) {
            System.out.println("Некорректно введено дата рождения!");
        }
        try {
            exception.checkDataOnTelephoneNumberFormat(dataArray);
            count++;
        } catch (NumberFormatException e) {
            System.out.println("Некорректно введен номер телефона!");
        }
        try {
            exception.checkDataOnGenderFormat(dataArray);
            count++;
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректно введен пол!");
        }
        try {
            exception.checkDataOnNameFormat(dataArray);
            count++;
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректно введено имя!");
        }
        return count;
    }

    public void writeDataInFile(String dataBase) {
        fileService.createFile(data.getArrayOfStrings(dataBase));
    }
}
