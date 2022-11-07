/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива и
возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 */

package Homework1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Integer[] arrayOne = {3,41,21,2};
        Integer[] arrayTwo = {2,3,5};
        arraDdivide(arrayOne, arrayTwo);
    }

    public static Integer[] arraDdivide(Integer[] arrOne, Integer[] arrTwo) {
        if (arrOne.length != arrTwo.length) {
            throw new RuntimeException("Array lengths are not equal!");
        } 
        else {
            Integer[] newArr = new Integer[arrOne.length];
            for (int i = 0; i < arrOne.length; i++) {
                newArr[i] = arrOne[i] / arrTwo[i];
            }
            System.out.println("Results: " + Arrays.toString(newArr));
            return newArr;
        }
    }
}