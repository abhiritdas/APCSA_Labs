import java.util.Scanner;
public class IfNotesMain {
    public static void main(String[] Args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num1 = kb.nextInt();
        if (num1 < 100) {
            System.out.println(num1 + " is less than 100");
        } else if (num1 > 100) {
            System.out.println(num1 + " is greater than 100");
        } else {
            System.out.println(num1 + " is equal to 100");
        }

        String password = "hello";
        System.out.print("Enter a String: ");
        String str = kb.next();
        if (!str.equals(password)) {    //checks if two strings are not equal
            System.out.println("The Strings are not the Same"); }
        else {
            System.out.println("The Strings are the Same"); }
    }
}