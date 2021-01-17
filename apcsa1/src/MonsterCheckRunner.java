/* Name: Abhirit Das
Period: 3
Lab/Project: MonsterCheckLab*/

import java.util.Scanner;
public class MonsterCheckRunner {
    public static void main (String[] Args) {
        Scanner kb = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Enter Monster 1 name: ");
            String name1 = kb.next();
            System.out.print("Enter monster 1 integer size: ");
            int size1 = kb.nextInt();
            MonsterCheck result = new MonsterCheck(name1, size1);

            System.out.print("\nEnter Monster 2 name: ");
            String name2 = kb.next();
            System.out.print("Enter monster 2 integer size: ");
            int size2 = kb.nextInt();
            MonsterCheck result1 = new MonsterCheck(name2, size2);

            result.MonsterStore();
            result1.MonsterStore();
            result.compareSize(size1, size2);

            System.out.println("Enter \"OK\" to restart");
            answer = kb.next();
        }
        while (answer.equals("OK"));
    }
}