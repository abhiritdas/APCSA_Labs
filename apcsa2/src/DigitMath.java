/* Name: Abhirit Das
  Period: 3
  Lab/Project: LoopLabRunner*/

public class DigitMath {
    public double calcDigit(int num) {
        String snum = Integer.toString(num);
        int i = 0;
        double solution = 0;

        while (i < snum.length()) {
            i++;
            solution += num % 10;
            num /= 10;
        }
        return solution/i;
    }
}