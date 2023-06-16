package Mate_01_Java_Basics.String;

public class GetSuccessRate {
    public static double getSuccessRate(String statistic) {
        if (statistic.isEmpty()) {
            return 0.0;
        }
        double counter = 0.0;
        char[] myChar = statistic.toCharArray();
        for (int currentChar : myChar) {
            if (currentChar == '1') {
                counter += 1.0;
            }
        }
        return counter / statistic.length();
    }
}
