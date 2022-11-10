package Lecture2;

public class Task3 {
    public static void main(String[] args) {


        //1. Exception in thread "main" java.lang.ClassCastException:
        //class java.lang.String cannot be cast to class java.io.File
        //(java.lang.String and java.io.File are in module java.base of loader 'bootstrap')
        Object obj = new String("123");
        //File file = (File) obj;
        //System.out.println(file);
        System.out.println(obj);
        // 2. Exception in thread "main" java.lang.NumberFormatException: For input string: "123as"
        String number = "123as";
        int result = Integer.parseInt(number);
        System.out.println(result);

    }
}