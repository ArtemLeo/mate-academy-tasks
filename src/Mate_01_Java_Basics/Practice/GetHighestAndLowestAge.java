package Mate_01_Java_Basics.Practice;

public class GetHighestAndLowestAge {
    public static int[] getHighestAndLowestAge(int[] ages) {
        int[] minmax = new int[]{ages[0], ages[0]};
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > minmax[0]) {
                minmax[0] = ages[i];
            }
            if (ages[i] < minmax[1]) {
                minmax[1] = ages[i];
            }
        }
        return minmax;
    }
}
