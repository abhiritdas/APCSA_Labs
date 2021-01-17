/* Name: Abhirit Das
  Period: 3
  Lab/Project: GradeCheckLab*/

import java.util.Scanner;
public class Grade {
    public static void main (String[] Args) {
        Scanner kb = new Scanner(System.in);
        String answer;
        GradeCheck value = new GradeCheck();
        do {
            System.out.print("Enter a Integer Grade: ");
            int grade = kb.nextInt();
            System.out.println(grade + " is a " + value.check(grade));

            System.out.print("Type \"OK\" to continue: ");
            answer = kb.next();
        }
        while(answer.equals("OK"));
    }
}