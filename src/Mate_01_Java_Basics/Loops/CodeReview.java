package Mate_01_Java_Basics.Loops;

public class CodeReview {
    public static int reviewCode(int maxAttempts) {
        int solutionAttempts = 0;
        do {
            solutionAttempts++;
        }
        while (solutionAttempts < maxAttempts);
        return solutionAttempts;
    }
}
