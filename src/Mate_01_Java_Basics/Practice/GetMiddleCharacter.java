package Mate_01_Java_Basics.Practice;

public class GetMiddleCharacter {
    public static String getMiddleString(String originalString) {
        if (originalString == "") {
            return originalString;
        } else {
            char[] chars = originalString.toCharArray();
            if (chars.length % 2 == 0) {
                char[] res = new char[2];
                res[0] = chars[chars.length / 2 - 1];
                res[1] = chars[chars.length / 2];
                String result = new String(res);
                return result;
            } else {
                char[] res = new char[1];
                res[0] = chars[chars.length / 2];
                String result = new String(res);
                return result;
            }
        }
    }
}

