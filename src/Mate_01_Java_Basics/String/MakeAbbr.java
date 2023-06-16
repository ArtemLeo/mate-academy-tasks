package Mate_01_Java_Basics.String;

public class MakeAbbr {
    public static String makeAbbr(String fullName) {
        String[] spaceWords = fullName.split(" ");
        String abbr = "";
        for (int i = 0; i < spaceWords.length; i++) {
            abbr += spaceWords[i].charAt(0);
        }
        return abbr.toUpperCase();
    }
}
