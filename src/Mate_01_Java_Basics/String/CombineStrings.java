package Mate_01_Java_Basics.String;

public class CombineStrings {
    public static String combineStrings(String one, String two) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(one).append(two);
        String newString = stringBuilder.toString();
        return newString;
    }
}
