package Mate_01_Java_Basics.Conditionals;

public class GetLargestExpressionResult {
    public static double getResult(double a, double b) {
        double plus = a + b;
        double minus = a - b;
        double umnogit = a * b;
        double delit = a / b;
        if (plus > minus && plus > umnogit && plus > delit) {
            return plus;
        } else if (minus > plus && minus > umnogit && minus > delit) {
            return minus;
        } else if (umnogit > minus && umnogit > plus && umnogit > delit) {
            return umnogit;
        } else if (delit > minus && delit > umnogit && delit > plus) {
            return delit;
        }
        return delit;
    }
}
