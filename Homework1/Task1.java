/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
 */

package Homework1;

public class Task1 {
    public static void main(String[] args) {
        Double[] arr = {};
        System.out.println(exceptionLengthArray(arr));
        System.out.println(exceptionDataType(21));
        System.out.println(exceptionDivisionByZero(1,0));
    }

    public static Double exceptionLengthArray(Double[] array){
        return array[0];
    }

    public static int[] exceptionDataType(int num){
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = num;
        arr[2] = Integer.parseInt("Number");
        return arr;
    }

    public static int exceptionDivisionByZero(int numberOne, int numberTwo){
        return numberOne/numberTwo;
    }
}