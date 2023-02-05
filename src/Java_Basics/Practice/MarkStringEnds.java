package Java_Basics.Practice;

public class MarkStringEnds {
    public static String[] markStringEnds(String originalString) {
        String twice = originalString + " " + originalString;
        char[] symbols = twice.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < symbols.length; i++) {
            if (i == 0 || i == (symbols.length - 1)) {
                builder.append(String.valueOf(symbols[i]).toUpperCase());
            } else {
                builder.append(symbols[i]);
            }
        }
        String a = builder.toString();
        return a.split(" ");
    }
}
