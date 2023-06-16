package Mate_01_Java_Basics.Practice;

public class DivisibleNumbers {
    public static int[] getDivisibleNumbers(int[] numbers, int divider) {
        int size = 0;
        for (int number : numbers) {
            if (number > 0 && number % divider == 0) {
                size++;
            }
        }
        int[] numberNew = new int[size];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0 && numbers[i] % divider == 0) {
                numberNew[counter++] = numbers[i];
            }
        }
        return numberNew;
    }
}
