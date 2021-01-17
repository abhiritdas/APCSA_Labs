/* Name: Abhirit Das
  Period: 3
  Lab/Project: GradeCheckLab*/

public class GradeCheck {
    public char check(int grade) {
        if (grade >= 90){
            return 'A';
        }
        else if (grade >= 80) {
            return 'B';
        }
        else if (grade >= 75) {
            return 'C';
        }
        else if (grade >= 70) {
            return 'D';
        }
        else {
            return 'F';
        }
    }
}
