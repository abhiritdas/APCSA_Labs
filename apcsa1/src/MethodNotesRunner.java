//Method Notes

//import java.lang.Math;
import java.util.Scanner;
public class MethodNotesRunner {
   public static void main (String[] args) {
      Scanner kb = new Scanner(System.in);

      System.out.print("Enter 2 Integers: ");
      MethodNotes calc = new MethodNotes();
      int value1 = kb.nextInt();
      int value2 = kb.nextInt(); //^these are actual parameters
   
      int product = calc.times(value1, value2);
      calc.sayResult(product); //this is also an actual parameter
      
      System.out.println("Rounded down is: " + Math.floor(2.89));
   }
}