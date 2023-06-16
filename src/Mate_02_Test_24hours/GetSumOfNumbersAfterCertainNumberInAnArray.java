package Mate_02_Test_24hours;

public class GetSumOfNumbersAfterCertainNumberInAnArray {
    public static int getSum(int[] values, int startValue) {
        int sum = 0;
        for (int i = 0; i < values.length - 1; i++) {
            if (startValue == values[i]) {
                for (int j = i; j < values.length - 1; j++) {
                    sum += values[j + 1];
                }
                break;
            }
        }
        return sum;
    }
}
