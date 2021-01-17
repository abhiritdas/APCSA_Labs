/* Name: Abhirit Das
  Period: 3
  Lab/Project: LoopLabRunner*/

public class DigitAdder {
    public int calcAdd(int num) {
        int value = 0;
        while (num > 0) {
            value += num % 10;
            num = num / 10;
        }
        return value;
    }
}