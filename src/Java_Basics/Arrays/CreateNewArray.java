package Java_Basics.Arrays;

public class CreateNewArray {
    public static int[] createArray() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
}
