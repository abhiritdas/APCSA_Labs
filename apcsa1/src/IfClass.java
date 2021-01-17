public class IfClass {
    private int year;
    public IfClass(int nextInt) {
        year = nextInt;
    }

    public void yearResult() {
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        }
        if (year % 4 != 0) {
            System.out.println(year + " is NOT a leap year.");
        }
    }

    public double admResult(double a, double b) {
        if (a > b) {
            return a - b;
        } else if (b > a) {
            return b - a;
        } else if (b == a) {
            return a * b;
        }
        return a - b;
    }

    public boolean isEven(int i1) {
        if (i1 % 2 == 0) {
            return true;
        }
            return false;
    }

    public String isValid(String code) {
        if (code.charAt(3) == '-' && code.charAt(6) == '-') {
            return code.substring(code.length() - 4);
        }
        else {
            return "bad";
        }
    }

    public String isRepeat(String string1) {
        char char1 = string1.charAt(0);
        string1 = string1.substring(1);
        if (string1.indexOf(char1) != -1) {
            return "yes";
        }
        else {
            return "no";
        }
    }
}