package Mate_01_Java_Basics.Practice;

public class CenturyFromYear {
    public static int getCentury(int year) {
        int answer = 1;
        if (year > 100) {
            answer = (year / 100) + 1;
        } else if (year < 100) {
            answer = year % 100;
        }
        return (year + 99) / 100;
    }
}
