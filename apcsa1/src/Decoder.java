public class Decoder {
    private char a;
    public char changeLetter(char letter) {
        if (letter >= 'a' && letter <= 'z') {
            a = Character.toUpperCase(letter);
        }
        else if (letter >= 'A' && letter <= 'Z') {
            a = Character.toLowerCase(letter);
        }
        else if (letter >= 48 && letter <= 57) {
            a = (char) (letter + 17);
        }
        else {
            a = '#';
        }
        return a;
    }
}