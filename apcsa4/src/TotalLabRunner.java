/*Abhirit Das
Period: 3 */

import java.util.ArrayList;
import java.util.Scanner;
public class TotalLabRunner {
    public static void main(String[] Args) {
        Scanner kb = new Scanner(System.in);
        String answer;

        do {

            ArrayList<Integer> a1 = new ArrayList<>();
            System.out.print("\nHow many values? ");
            int value = kb.nextInt();

            System.out.print("Enter " + value + " integers:");
            for (int i = 0; i < value; i++) {
                a1.add(kb.nextInt());
            }

            TotalLab object = new TotalLab(a1);

            System.out.println("\nListTotal:");
            object.ListTotal();
            System.out.println("\nListSumFirst:");
            object.ListSumFirst();
            System.out.println("\nListLast:");
            object.ListLast();
            System.out.println("\nListOddtoEven:");
            object.ListOddtoEven();
            System.out.println("\nListAverage:");
            object.ListAverage();
            System.out.println("\nListDown:");
            //object.ListDown();
            System.out.println("\nListGetNums:");
            object.ListGetNums();
            System.out.println("\nListGetLast:");
            object.ListGetLast();
            /*System.out.println("\nListNoRepeats:");
            object.ListNoRepeats();*/

            System.out.print("Type \"OK\" to continue: ");
            answer = kb.next();

        }
        while(answer.equals("OK"));
    }
}