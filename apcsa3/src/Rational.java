/* Name: Abhirit Das
Period: 3
Lab/Project: RationalRunnerLab*/

public class Rational {
    private double int1;
    private double int2;

    public Rational() {
    }

    public Rational(double int1, double int2) {
        this.int1 = int1;
        this.int2 = int2;
    }

    public String toString() {
        return int1 + "/" + int2;
    }
    public void compareFractions(double f1, double f2) {
        if (f1 > f2)
            System.out.println("rOne is greater than rTwo");
        else if (f2 > f1)
            System.out.println("rOne is less than rTwo");
        else
            System.out.println("rOne is equal to rTwo");
    }
}