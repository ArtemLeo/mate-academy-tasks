package Mate_01_Java_Basics.Practice;

public class GetAverageSalary {
    public static double getAverageSalary(double[] salaries) {
        double sum = 0;
        double average = 0.0;
        if (salaries == null) {
            return average = salaries[0];
        }
        if (salaries.length > 0) {
            for (double salary : salaries) {
                sum += salary;
            }
            average = sum / salaries.length;
        }
        return average;
    }
}
