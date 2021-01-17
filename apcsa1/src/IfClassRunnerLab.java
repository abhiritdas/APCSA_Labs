/* Name: Abhirit Das
Period: 3
Lab/Project: IfClassesLab*/

import java.util.Scanner;
public class IfClassRunnerLab {
    public static void main (String[] Args) {
        Scanner kb = new Scanner(System.in);
        String answer;
        do {

            System.out.print("(LeapYear) Enter a year: ");
            IfClass ifobject = new IfClass(kb.nextInt());   //object instantiation
            ifobject.yearResult();

            System.out.print("(AddSubMult) Enter two numbers: ");
            double a = kb.nextDouble();
            double b = kb.nextDouble();
            System.out.println("Result: " + ifobject.admResult(a, b));

            System.out.print("(NumberVerify) Enter a whole number: ");
            int i1 = kb.nextInt();
            boolean result1 = ifobject.isEven(i1);
            boolean result2 =! result1;
            System.out.println(i1 + " is odd: " + result2);
            System.out.println(i1 + " is even: " + result1);

            System.out.print("(Social) Enter a ss number: ");
            System.out.println(ifobject.isValid(kb.next()));

            System.out.print("(First) Enter a string: ");
            System.out.println(ifobject.isRepeat(kb.next()));


            System.out.println("Enter \"OK\" to restart");
            answer = kb.next();

        }
        while (answer.equals("OK"));
    }
}