package Mate_01_Java_Basics.Conditionals;

public class CalculateTaxes {
    public static double calculateTaxes(double income) {
        if (income <= 1000) {
            return income * 0.02;
        } else if (income >= 1000 && income <= 10000) {
            return income * 0.03;
        } else {
            return income * 0.05;
        }
    }
}
