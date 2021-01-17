/* Abhirit Das
Period: 3
CountPairsLabs
 */
public class CountPairs {
    public int calcPairs(String str) {
        int length = str.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    count++;
                }
            }
        }
        return count;
    }
}