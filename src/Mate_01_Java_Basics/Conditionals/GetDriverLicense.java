package Mate_01_Java_Basics.Conditionals;

public class GetDriverLicense {
    public static String getDriverLicense(int age) {
        if (age >= 16) {
            return "You can get a license";
        } else {
            return "You can't get a license";
        }
    }
}
