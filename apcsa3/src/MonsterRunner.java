/* Name: Abhirit Das
Period: 3
Lab/Project: MonsterCheckLab*/

import java.util.Scanner;
public class MonsterRunner {
    public static void main (String[] Args) {
        Scanner kb = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Enter Monster 1 name: ");
            String name1 = kb.next();
            System.out.print("Enter monster 1 integer size: ");
            int size1 = kb.nextInt();
            Monster mOne = new Monster(name1, size1, 1);

            System.out.print("\nEnter Monster 2 name: ");
            String name2 = kb.next();
            System.out.print("Enter monster 2 integer size: ");
            int size2 = kb.nextInt();
            Monster mTwo = new Monster(name2, size2, 2);

            mOne.MonsterStore();
            mTwo.MonsterStore();
            mOne.compareSize(size1, size2);
            if (name1.equals(name2))
                System.out.println("Monster one has the same name as Monster two.");

            System.out.println("Enter \"OK\" to restart");
            answer = kb.next();
        }
        while (answer.equals("OK"));
    }
}