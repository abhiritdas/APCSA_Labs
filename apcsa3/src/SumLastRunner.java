//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Abhirit Das
//Date - 1/20/2021

import java.util.Scanner;
public class SumLastRunner
{
	public static void main(String[] Args)
	{
		Scanner kb = new Scanner(System.in);
		RaySumLast thing = new RaySumLast();
		int length;
		System.out.print("How many values: ");
		length = kb.nextInt();

		int[] numbers = new int[length];
		for(int i = 0; i < length; i++) {
			System.out.print("Enter value for " + (i + 1) + ": ");
			numbers[i] = kb.nextInt();
		}
		kb.close();
		System.out.println(thing.calcAdd(numbers));
	}
}