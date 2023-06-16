package Mate_01_Java_Basics.Loops;

public class GetDrinksWithStep {
    public static int getDrinksWithStep(int guestNumber, int step) {
        int sum = 0;
        for (int i = 1; i <= guestNumber; i += step) {
            sum += i;
        }
        return sum;
    }
}
