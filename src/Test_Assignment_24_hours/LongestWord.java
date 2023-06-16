package Test_Assignment_24_hours;

public class LongestWord {
    public static int findLongest(String sentence) {
        int sum = 0;
        if(sentence == null){
            return 0;
        }else{
            String[] sentences = sentence.split("\\s+|,\\s*");
            for (int i = 0; i < sentences.length; i++) {
                if (sum < sentences[i].length())
                    sum = sentences[i].length();
            }
        }
        return sum;
    }
}


