/* Name: Abhirit Das
  Period: 3
  Lab/Project: LoopLabRunner*/

import java.util.Scanner;
public class JavaLoopLabRunner {
    public static void main (String[] Args) {
        String answer;
        Scanner kb = new Scanner(System.in);
        DigitCounter result1 = new DigitCounter();
        DigitAdder result2 = new DigitAdder();
        DigitMath result3 = new DigitMath();

    do {
        System.out.print("Enter a Number: ");
        int num = kb.nextInt();
        System.out.println("\nDigitCounter: " + result1.calcDigit(num));
        System.out.println("DigitAdder: " + result2.calcAdd(num));
        System.out.println("DigitMath: " + result3.calcDigit(num)); //todo fix method

        System.out.print("\nEnter \"OK\" to continue: ");
        answer = kb.next();
    }
    while(answer.equals("OK"));
    }
}