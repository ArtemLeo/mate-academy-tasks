package Mate_01_Java_Basics.String;

public class CreateGreeting {
    public static String createGreeting(String input) {
        StringBuilder stringBuilder = new StringBuilder("Hello, ");
        stringBuilder.append(input);
        return stringBuilder.toString();
    }
}
