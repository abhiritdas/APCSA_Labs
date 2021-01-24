//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Abhirit Das
//Date - 1/20/2021

public class RayTotal
{
	public static int go(int[] ray)
	{
		int sum = 0;
		for (int i = 0; i < ray.length; i++)
			sum += ray[i];
		return sum;
	}
}