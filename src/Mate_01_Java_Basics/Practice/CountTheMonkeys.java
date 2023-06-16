package Mate_01_Java_Basics.Practice;

public class CountTheMonkeys {
    public static int[] countTheMonkeys(int count) {
        int[] all = new int[count];
        for (int i = 0; i < count; i++) {
            all[i] = i + 1;
        }
        return all;
    }
}

