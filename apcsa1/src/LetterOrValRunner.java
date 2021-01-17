/* Abhirit Das
Period: 3
LetterOrVowelLab
 */

import java.util.Scanner;
public class LetterOrValRunner {
    public static void main (String[] Args) {
        Scanner kb = new Scanner(System.in);
        String answer;
    do {
        System.out.print("Enter a String: ");
        LetterOrVowel result = new LetterOrVowel();
        System.out.println(result.charCalc(kb.next()));
        System.out.print("Type \"OK\" to continue: ");
        answer  = kb.next();
    }
    while (answer.equals("OK"));
    }
}