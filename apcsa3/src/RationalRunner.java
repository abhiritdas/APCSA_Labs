/* Name: Abhirit Das
Period: 3
Lab/Project: RationalRunnerLab*/

import java.util.Scanner;

public class RationalRunner {
    public static void main (String[] Args) {
        Scanner kb = new Scanner(System.in);
        double i1, i2, i3, i4;

            System.out.print("Enter values for FIRST fraction: ");
                i1 = kb.nextInt();
                i2 = kb.nextInt();
            Rational rOne = new Rational(i1, i2);
            System.out.print("Enter values for SECOND fraction: ");
                i3 = kb.nextInt();
                i4 = kb.nextInt();
            Rational rTwo = new Rational(i3, i4);

            double f1 = i1/i2;
            double f2 = i3/i4;
            Rational result = new Rational();

            System.out.println(f1);
            System.out.println("\nrOne = " + rOne);
            System.out.println("rTwo = " + rTwo);
            result.compareFractions(f1, f2);

    }
}