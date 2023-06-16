package Mate_01_Java_Basics.String;

public class ReverseString {
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
