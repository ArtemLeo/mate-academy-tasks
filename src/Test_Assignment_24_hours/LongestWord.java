package Test_Assignment_24_hours;

public class LongestWord {
    public static void main(String[] args) {
        String s = "fi owhfwi fowfo w";
        findLongest(s);
    }

    public static int findLongest(String sentence) {
        // WRITE YOUR CODE BELOW THIS LINE
        String[] word = sentence.split(" ");
        String maxWord = "";
        if (sentence != null) {
            for (int i = 0; i < word.length; i++) {
                if (word[i].length() >= maxWord.length()) {
                    maxWord = word[i];
                }
            }

            return maxWord.length();
        }
        return sentence.length();
    }
    // WRITE YOUR CODE ABOVE THIS LINE
}

