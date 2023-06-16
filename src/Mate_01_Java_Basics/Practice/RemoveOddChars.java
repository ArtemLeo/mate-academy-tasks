package Mate_01_Java_Basics.Practice;

public class RemoveOddChars {
    public static String removeOddChars(String originalString) {
        String result = "";
        char[] test = originalString.toCharArray();
        int i = 0;
        char[] app = new char[originalString.length()];
        for (i = 0; i < test.length; i++) {
            if ((i + 1) % 2 != 0) {
                result = result + test[i];
            }
        }
        return result;
    }
}
