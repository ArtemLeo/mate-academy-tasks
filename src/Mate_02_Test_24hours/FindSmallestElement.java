package Mate_02_Test_24hours;

public class FindSmallestElement {
    public static int findSmallestElement(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= min) {
                min = nums[i];
            }
        }
        return min;
    }
}
