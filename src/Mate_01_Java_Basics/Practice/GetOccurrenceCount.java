package Mate_01_Java_Basics.Practice;

public class GetOccurrenceCount {
    public static int getOccurrenceCount(String[] colors, String targetColor) {
        int count = 0;
        for (String color : colors) {
            if (color.equals(targetColor)) {
                count++;
            }
        }
        return count;
    }
}
