/* Abhirit Das
1/26/2021
Period: 7
 */
import java.util.Scanner;

public class WordSortRunner {
    public static void main(String[] Args) {
        Scanner kb = new Scanner(System.in);
        WordSort sort = new WordSort();
        String answer;
    do {
        System.out.print("How many words? ");
        int n = kb.nextInt();
        String[] words = new String[n];
        System.out.print("Enter " + n + " words: ");
        for (int i = 0; i < n; i++) {
            words[i] = kb.next();
        }
        sort.wordDisplay(words);

        System.out.print("\nType \"ok\" to restart: ");
        answer = kb.next();
    }
        while(answer.equals("ok"));
    }
}