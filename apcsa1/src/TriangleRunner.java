/* Name: Abhirit Das		
  Period: 3
  Lab/Project: TriangleLab*/

import java.util.Scanner;
public class TriangleRunner {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String answer;
do {
		
	System.out.print("Enter Side A: ");
		double a = kb.nextDouble();
	System.out.print("Enter Side B: ");
		double b = kb.nextDouble();
	System.out.print("Enter Side C: ");
		double c = kb.nextDouble();
		
	Triangle calc = new Triangle();
	System.out.println("\n"+ a + ", " + b + ", " +c);
	System.out.print("Area == ");
	System.out.printf("%.5f\n", calc.area(a, b, c));
	
	System.out.println("Enter \"OK\" to continue");
	answer = kb.next();
	}

	while (answer.equals("OK"));

	}

}