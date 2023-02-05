package Java_Basics.String;

public class MakeAbbr {
    public static String makeAbbr(String fullName) {
        String[] spacewords = fullName.split(" ");
        String abbr = "";
        for (int i = 0; i < spacewords.length; i++) {
            abbr += spacewords[i].charAt(0);
        }
        return abbr.toUpperCase();
    }
}
