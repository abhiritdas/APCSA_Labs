/* Abhirit Das
Period: 3
FactorialLabs
 */
public class Factorial {
    public int calcFactorial(int num) {
        int fact = 1;
        for (int i=1; i<=num; i++) {
            fact *= i;
        }
        return fact;
    }
}