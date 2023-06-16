package Mate_01_Java_Basics.Practice;

public class CombineArrays {
    public static int[] getCombinedArray(int[] firstArray, int[] secondArray) {
        int[] c = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, c, 0, firstArray.length);
        System.arraycopy(secondArray, 0, c, firstArray.length, secondArray.length);
        return c;
    }
}
