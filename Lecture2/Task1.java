package Lecture2;

public class Task1 {
    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 0;
            // String test = null;
            //System.out.println(test.length());
            //Collections.emptyList().add(new Object());
        } catch (ArithmeticException e) {
            System.out.println("operation divide by zero not supported");
        } catch (NullPointerException e) {
            System.out.println("NullPointer exception");
        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println(number);
    }
}