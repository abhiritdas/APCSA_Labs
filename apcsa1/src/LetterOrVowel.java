/* Abhirit Das
Period: 3
LetterOrVowelLab
 */

public class LetterOrVowel {
    public boolean charCalc(String str) {
        char char1 = str.charAt(0);
        if (char1 >= 'A' && char1 <= 'Z'|| char1 >= 'a' && char1 <= 'z') { //if letter
            if (char1 == 'a'|| char1 == 'e'|| char1 == 'i'|| char1 == 'o' ||char1 == 'u') { //if lowercase vowel
                return true;
            }
            else if (char1 == 'A'|| char1 == 'E'|| char1 == 'I'|| char1 == 'O' ||char1 == 'U') { //if uppercase letter
                return true;
            }
            else {
                return false;
            }
        }
        else if (Character.isDigit(char1)) { //if number
            return true;
        }
        else {
            return false;
        }

    }
}