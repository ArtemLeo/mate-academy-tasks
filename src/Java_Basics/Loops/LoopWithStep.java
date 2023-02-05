package Java_Basics.Loops;

public class LoopWithStep {
    public static int getSum(int n, int step) {
        int result = 0;
        for (int i = 0; i <= n; i += step) {
            result += i;
        }
        return result;
    }
}
