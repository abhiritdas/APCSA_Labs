/* Abhirit Das
Period: 3
CountPairsLabs
 */
import java.util.Scanner;
public class CountPairsRunner {
    public static void main (String[] Args) {
        String answer;
        Scanner kb = new Scanner(System.in);
        CountPairs result1 = new CountPairs();

        do {
            System.out.print("Enter a String: ");
            String str = kb.next();
            System.out.println("Letter Pairs: " + result1.calcPairs(str));

            System.out.print("\nEnter \"OK\" to continue: ");
            answer = kb.next();
        }
        while(answer.equals("OK"));
    }
}