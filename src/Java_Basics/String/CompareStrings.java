package Java_Basics.String;

public class CompareStrings {
    public static boolean compareStrings(String firstString, String secondString) {
        return firstString == null ? secondString == null : firstString.equals(secondString);
    }
}

