//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int i = 0;
		int oddnum = 0;
		int evennum = 0;
		boolean bool1 = true;
		boolean bool2 = false;

		while (i < ray.length){
			if (bool1 == true) {
				if (ray[i] % 2 != 0) {
					oddnum = i;
					bool1 = false;
					bool2 = true;
				}
			}
			if (bool2 == true) {
				if (ray[i] % 2 == 0) {
					evennum = i;
					bool2 = false;
				}
			}
			i++;
		}
		if (bool1 == true || bool2 == true)
			return -1;
		return evennum - oddnum;
	}
}