/* Abhirit Das
Period: 3
TriangleOneLabs
 */
public class TriangleOne {
    private String str;
    public TriangleOne(String string1) {
        str = string1;
    }

    public void TriangleResult() {
        for (int i = str.length()-1; i>-1; i--) {
            System.out.println(str);
            str = str.substring(0, i);
        }
    }
}