package Java_Basics.Practice;

public class ConvertBooleans {
    public static String[] getStringArray(boolean[] values) {
        String[] result = new String[values.length];
        if (values == null) {
            result = new String[]{};
        }
        for (int i = 0; i < values.length; i++) {
            if (values[i] == true) {
                result[i] = "Yes";
            } else if (values[i] == false) {
                result[i] = "No";
            } else {
                continue;
            }
        }
        return result;
    }
}