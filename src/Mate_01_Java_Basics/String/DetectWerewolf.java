package Mate_01_Java_Basics.String;

public class DetectWerewolf {
    public static boolean isWerewolf(String target) {
        StringBuilder builder = new StringBuilder(target).reverse();
        if (builder.toString().equals(target)) {
            return true;
        } else {
            return false;
        }
    }
}
