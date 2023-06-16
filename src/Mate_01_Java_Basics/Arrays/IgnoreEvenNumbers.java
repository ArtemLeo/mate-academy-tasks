package Mate_01_Java_Basics.Arrays;

public class IgnoreEvenNumbers {
    public static int getSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            } else {
                continue;
            }
        }
        return sum;
    }
}
