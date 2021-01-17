/* Name: Abhirit Das
  Period: 3
  Lab/Project: SocialSecurityLab*/

import java.util.Scanner;
public class SocialRunner {
    public static void main (String[] Args) {
        Scanner kb = new Scanner(System.in);
        String answer;
        Social value = new Social();
    do {
        System.out.print("Enter a SS number: ");
        String str = kb.next();
        int result = value.socialAdd(str);
        System.out.println("SS# " +  str + " has a total of " + result);

        System.out.print("Type \"OK\" to continue: ");
        answer = kb.next();
    }
        while(answer.equals("OK"));
    }
}