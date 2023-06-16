package Mate_01_Java_Basics.String;

public class FixNullPointer {
    public static String getUpperCase(String inputString) {
        if (inputString != null) {
            return inputString.toUpperCase();
        } else {
            return "The string is null!";
        }
    }
}
