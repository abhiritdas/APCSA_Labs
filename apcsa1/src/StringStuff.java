/* Name: Abhirit Das
Period: 3
Lab/Project: StringStuffClassLab*/

public class StringStuff {
    private String word;

    public StringStuff(String input) {
        word = input;
    }

    public String getFirstLastLetter() {
        char new1 = word.charAt(0);
        char new2 = word.charAt(word.length() -1);
        String result = new1+""+new2;
        return result;
    }
    public char getMiddleLetter() {
        int num = word.length();
        num = num / 2;
        char result = word.charAt(num);
        return result;
    }
    public boolean sameFirstLastLetters() {
        char c1 = word.charAt(0);
        char c2 = word.charAt(word.length()-1);
        boolean same;

        if (c1 == c2) {
            same = true;
        }
        else {
            same = false;
        }
        return same;
    }
}