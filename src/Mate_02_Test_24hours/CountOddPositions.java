package Mate_02_Test_24hours;

public class CountOddPositions {
    public static int countOddPositionChars(String[] array) {
        int counter = 0;
        int result = 0;
        if (array != null) {
            for (String value : array) {
                if (counter % 2 == 0) {
                    result += value.length();
                }
                counter++;
            }
        }
        return result;
    }
}
