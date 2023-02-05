package Java_Basics.Arrays;

public class SpeedStatistic {
    public static int[] getSpeedStatistic(int[] results) {
        if (results.length == 0) {
            return new int[]{0, 0};
        }
        int[] arr = {results[0], results[0]};
        if (results.length > 1) {
            for (int i : results) {
                if (i < arr[0]) {
                    arr[0] = i;
                }
                if (i > arr[1]) {
                    arr[1] = i;
                }
            }
        }
        return arr;
    }
}
