/* Name: Abhirit Das	
  Period: 3
  Lab/Project: DistanceLab*/

import java.util.Scanner;
public class DistanceRunner {
	
	public static void main(String[] args) {
		String answer;
		
	do {
		Scanner kb = new Scanner(System.in);
			System.out.print("Input 4 Integers for Calculating Distance: ");
			double x1  = kb.nextDouble();
			double y1  = kb.nextDouble();
			double x2  = kb.nextDouble();
			double y2  = kb.nextDouble();

		Distance distance = new Distance();
						
		System.out.println(" \nX1: " + x1);
		System.out.println("X2: " + x2);	
		System.out.println("Y1: " + y1);
		System.out.println("Y2: " + y2);
		System.out.print("Distance: ");
		System.out.printf("%.3f\n", distance.calcDist(x1, x2, y1, y2));
				
		System.out.println(" \nType \"OK\" to continue");
		answer = kb.next();
	}
	while (answer.equals("OK"));
	
	}

}