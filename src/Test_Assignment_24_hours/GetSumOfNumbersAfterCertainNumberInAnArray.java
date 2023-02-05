package Test_Assignment_24_hours;

public class GetSumOfNumbersAfterCertainNumberInAnArray {
    public static int getSum(int[] values, int startValue) {
        // WRITE YOUR CODE BELOW THIS LINE
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
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
