package Mate_01_Java_Basics.String;

public class CreateNewString {
    public static String createNewString(String input) {
        char[] chars = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(chars[1]).append(chars[3]);
        return stringBuilder.toString();
    }
}
