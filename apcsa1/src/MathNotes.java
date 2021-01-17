public class MathNotes {
   public static void main (String[] args) {
      System.out.println("6 + 5 == " + (6+5));
      System.out.println("6 - 5 == " + (6-5));
      System.out.println("6 * 5 == " + (6*5));
      System.out.println("6 / 5 == " + (6.0/5.0)); //double gives decimal values in output
      
      System.out.println("3 mod 2 == " + (3%2));
      System.out.println("2 mod 3 == " + (2%3));
      System.out.println("10 mod 3 == " + (10%3)); //mod yields the remainder after the int division
      
      System.out.println("9 mod 3 == " + (9%3)); //remain of 0...9 mod 3 = 0
      System.out.println("10.2 mod 3 == " + (10.2%3)); //9.2 divided 3 = 3 remainder 0.2... 10.2 mod 3 = 1.2

      int num = 10;
      System.out.println("\n" + num);
      num = num + 5;
      System.out.println(num);
      num = 7 + 10 * 2;		 //uses order of operations
      System.out.println(num);
    
      num *= 2; 			//27*2
      System.out.println(num);
      num /=5; 				//54/5
      System.out.println(num); 
      num = num + 4 / 2- 8;
      System.out.println(num);
      num = (4+5)/ 2+7;
      System.out.println(num);
      
   }
}