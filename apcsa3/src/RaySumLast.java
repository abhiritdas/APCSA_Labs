//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	private int sum = 0;
	private int i;
	public int calcAdd(int[] ray)
	{
		for (i = 0; i < ray.length - 2; i++) {
			sum += ray[i];
		}
		if (sum < ray[i+1])
			return -1;
		else {
			return sum;
		}
	}
}