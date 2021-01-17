/* Name: Abhirit Das
  Period: 3
  Lab/Project: GradeCheckLab*/

import java.util.Scanner;
public class DecoderRunner {
    public static void main (String[] Args) {
        Scanner kb = new Scanner(System.in);
        String answer;
        Decoder value = new Decoder();
        do {
            System.out.print("Enter a letter: ");
            char letter = kb.next().charAt(0);
            System.out.println(letter + " decodes to " + value.changeLetter(letter));

            System.out.print("Type \"OK\" to continue: ");
            answer = kb.next();
        }
        while(answer.equals("OK"));
    }
}