/* Name: Abhirit Das
Period: 3
Lab/Project: QuadraticLab*/

import java.util.Scanner;
public class QuadraticRunner {
	public static void main(String[] args) {
		String answer;
		Scanner kb = new Scanner(System.in);
	do {
		
		System.out.print("Enter 3 values: ");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();
		
		Quadratic quad = new Quadratic();
		double solution1 = quad.calcQuad(a, b, c);
		double solution2 = quad.calcQuad2(a, b, c);
		
		System.out.println("Enter a : "+ a + "\nEnter b: "+ b + "\nEnter c: "+c);
		
		System.out.print("\nroot1: ");		
				System.out.printf("%.3f\n", solution1);
		System.out.print("root2: ");
				System.out.printf("%.3f\n", solution2);

		System.out.println("\nType \"OK\" to continue");
		answer = kb.next();
		
	}
	while (answer.equals("OK"));	
	}

}