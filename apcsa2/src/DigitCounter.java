/* Name: Abhirit Das
  Period: 3
  Lab/Project: LoopLabRunner*/

public class DigitCounter {
    public int calcDigit(int num) {
        int i = 0;
        while (num > 0) {
            i++;
            num = num / 10;
        }
            return i;
    }
}