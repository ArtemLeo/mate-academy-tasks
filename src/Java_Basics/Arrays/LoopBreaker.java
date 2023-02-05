package Java_Basics.Arrays;

public class LoopBreaker {
    public static int getSum(int[] numbers) {
        int sum = 0;
        int middle = numbers.length / 2;
        for (int i = middle; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                break;
            } else {
                sum += numbers[i];
            }
        }
        return sum;
    }
}
