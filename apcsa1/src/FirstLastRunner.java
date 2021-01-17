/* Name: Abhirit Das	
  Period: 3
  Lab/Project: FirstLastLab*/

import java.util.Scanner;

public class FirstLastRunner {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String answer;
		
	do {	
		System.out.print("Enter Two Strings: ");
		String string1 = kb.next();
		String string2 = kb.next();
		
		FirstLast result = new FirstLast();
		result.calcResult(string1 , string2);
		
		
		System.out.println("\nType \"OK\" to Continue");
		answer = kb.next();
		
	}
	while (answer.equals("OK"));
	}
	
}