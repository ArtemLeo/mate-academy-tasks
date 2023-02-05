package Java_Basics.Arrays;

public class IndexOutOfBoundExceptionExample {
    public static String[] createArray() {
        String[] fruits = new String[3];
        fruits[2] = "lemon";
        return fruits;
    }
}
