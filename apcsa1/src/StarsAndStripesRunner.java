/*Abhirit Das
3rd Period */

import java.util.Scanner;
public class StarsAndStripesRunner {
	
	public static void main(String[]Args) {
		
		Scanner kb = new Scanner(System.in);
		ChooseCharacter multiplier = new ChooseCharacter();
		
		System.out.print("Enter a Value: ");
		int value = kb.nextInt();		
		
		int product = multiplier.times(value);
		
		multiplier.dashResult(product);
		multiplier.astrickResult(product);
		multiplier.astrickResult(product);
		multiplier.dashResult(product);
		multiplier.astrickResult(product);
		multiplier.astrickResult(product);
		multiplier.dashResult(product);
		multiplier.astrickResult(product);
		multiplier.astrickResult(product);
		multiplier.dashResult(product);
		multiplier.dashResult(product);
		multiplier.astrickResult(product);
		multiplier.dashResult(product);
		multiplier.dashResult(product);
		multiplier.astrickResult(product);
		multiplier.dashResult(product);
		multiplier.dashResult(product);
		multiplier.astrickResult(product);
		
		}

}