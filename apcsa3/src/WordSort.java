import java.util.Arrays;

public class WordSort {

    public void wordDisplay(String[] words) {

        Arrays.sort(words);
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word " + (i+1) + ": " + words[i]);
        }

    }
}