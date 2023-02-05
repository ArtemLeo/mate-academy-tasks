package Java_Basics.Conditionals;

public class GetTipsRating {
    public static String getTipsRating(int amount) {
        if (amount == 0) {
            return "terrible";
        } else if (amount > 0 && amount <= 10) {
            return "poor";
        } else if (amount > 10 && amount <= 20) {
            return "good";
        } else if (amount > 20 && amount <= 50) {
            return "great";
        } else {
            return "excellent";
        }
    }
}
