//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Abhirit Das
//Date - 1/24/2021

public class RayFirst
{
	public static boolean go(int[] ray)
	{
		int count = 0;
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] == ray[0])
				count++;
		}
		if (count < 2)
			return false;
		else
			return true;
	}
}