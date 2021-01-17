/* Abhirit Das
Period: 3
TriangleOneLabs
 */
import java.util.Scanner;
public class TriangleOneRunner {
    public static void main (String[] Args) {
        Scanner kb = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Enter a word: ");
            TriangleOne makeTriangle = new TriangleOne(kb.next());
            makeTriangle.TriangleResult();

            System.out.print("\nEnter \"OK\" to continue: ");
            answer = kb.next();
        }
        while(answer.equals("OK"));
    }
}