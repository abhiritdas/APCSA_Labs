/* Name: Abhirit Das
  Period: 3
  Lab/Project: SocialSecurityLab*/

public class Social { //error doesn't work properly
    public int socialAdd(String num) {
        int index1 = num.indexOf('-');
        int index2 = num.lastIndexOf('-');

        if (index1 != -1 && index2 != -1) {
            if (index1 != index2) {
                String str1 = num.substring(0, index1);
                int num1 = Integer.parseInt(str1);
                String str2 = num.substring(index1 + 1, index2);
                int num2 = Integer.parseInt(str2);
                String str3 = num.substring(index2 + 1, num.length());
                int num3 = Integer.parseInt(str3);
                return num1 + num2 + num3;
            }
            else {
                return -1;
            }
        }
        else {
            return -1;
        }

    }
}
