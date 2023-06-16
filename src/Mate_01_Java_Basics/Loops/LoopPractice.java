package Mate_01_Java_Basics.Loops;

public class LoopPractice {
    public static int getSum(int n) {
        int result = 0;
        for (int i = 0; i <= n; i = i + 1) {
            result += i;
        }
        return result;
    }
}
