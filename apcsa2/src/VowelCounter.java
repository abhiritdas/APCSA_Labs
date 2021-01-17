/* Abhirit Das
Period: 3
VowelCounterLabs
 */
public class VowelCounter {
    public String stringVowel(String str) {
        int vowelCount = '0';
        for (int i=0; i<str.length(); i++) {
            char value = str.charAt(i);
            if (value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u') {
                char vowelChar = (char)vowelCount;
                str = str.substring(0, i)   //vowel change
                        + vowelChar
                        + str.substring(i + 1);
                vowelCount++;
            }
        }
        return str;
    }
}