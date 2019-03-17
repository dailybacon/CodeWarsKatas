package eightkyu;

import java.util.Arrays;
import java.util.List;

public class ShortestWordLength {
    public static void main(String[] args) {


    }
    public static int findShort(String s) {
        int shortestWordLength = -1;
        List<String> wordList = Arrays.asList(s.split("\\s+"));

        for(String word : wordList){
            if (shortestWordLength == -1 || word.length() < shortestWordLength) {
                shortestWordLength = word.length();
            }
        }

        return shortestWordLength;
    }

    public static int findShortStream(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }
}

