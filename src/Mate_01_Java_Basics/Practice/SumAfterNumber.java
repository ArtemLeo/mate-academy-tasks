package Mate_01_Java_Basics.Practice;

public class SumAfterNumber {
    public static int getSum(int[] values, int startValue) {
        if (values.length == 1 || values.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == startValue) {
                for (int j = i + 1; j < values.length; j++) {
                    sum += values[j];
                }
                break;
            }
        }
        return sum;
    }
}
