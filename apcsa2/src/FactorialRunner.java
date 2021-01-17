/* Abhirit Das
Period: 3
FactorialLabs
 */
import java.util.Scanner;
public class FactorialRunner {
    public static void main (String[] Args) {
        Scanner kb = new Scanner(System.in);
        Factorial count = new Factorial();
        String answer;
        do {
            System.out.print("Enter an Integer: ");
            int num = kb.nextInt();
            System.out.println(count.calcFactorial(num));

            System.out.print("\nEnter \"OK\" to continue: ");
            answer = kb.next();
        }
        while(answer.equals("OK"));
    }
}