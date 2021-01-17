/* Abhirit Das
Period: 3
VowelCounterLabs
 */
import java.util.Scanner;
public class VowelCounterRunner {
    public static void main (String[] Args) {
        Scanner kb = new Scanner(System.in);
        VowelCounter count = new VowelCounter();
        String answer;
    do {
        System.out.print("Enter a word: ");
        String str = kb.next();
        System.out.println(count.stringVowel(str));

        System.out.print("\nEnter \"OK\" to continue: ");
        answer = kb.next();
    }
        while(answer.equals("OK"));
    }
}