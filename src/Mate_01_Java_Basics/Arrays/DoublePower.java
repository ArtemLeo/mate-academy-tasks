package Mate_01_Java_Basics.Arrays;

public class DoublePower {
    public static int[] getDoublePower(int[] powers) {
        for (int i = 0; i < powers.length; i++) {
            powers[i] = powers[i] * 2;
        }
        return powers;
    }
}
