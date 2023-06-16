package Mate_01_Java_Basics.Arrays;

public class IgnoreEvenNumbers {
    public static int getSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                sum += number;
            } else {
                continue;
            }
        }
        return sum;
    }
}
