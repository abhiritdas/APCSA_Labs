/* Name: Abhirit Das
Period: 3
Lab/Project: StringStuffClassLab*/

import java.util.Scanner;
public class StringRunner {
    public static void main(String[] Args) {
        String answer;
    do {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a word: ");
        StringStuff thing = new StringStuff(kb.next());

        System.out.println("first last letters: " + thing.getFirstLastLetter());
        System.out.println("middle letter: " + thing.getMiddleLetter());
        System.out.println("same first and last letter: " + thing.sameFirstLastLetters());

        System.out.print("Enter \"OK\" to continue: ");
        answer = kb.next();
    }
    while(answer.equals("OK"));
    }
}