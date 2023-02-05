package Java_Basics.Loops;

public class BackwardsLoop {
    public static int getSum(int n) {
        int result = 0;
        for (int i = n; i >= 0; i--) {
            result += i;
        }
        return result;
    }
}
