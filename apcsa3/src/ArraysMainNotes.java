import java.util.Arrays;

public class ArraysMainNotes {
    public static void main(String[] Args){
        int[] numbers = new int[10];
        //arrayType reference var = new (instance) arrayType[length] "constructor"
        numbers[0] = 25;
        numbers[3] = 18;
        System.out.println("The value at index 3 is: " + numbers[3]);

        String[] schedule = {"first", "second", "third", "APCSA"};
        schedule[2] = "APCSA";
        System.out.println(Arrays.toString(schedule));

        int[] numbers10 = {0, 1, 2, 3, 4, 0};
        System.out.println(numbers10[5]);
        numbers10[5] = 15;
        System.out.println(numbers10[5]);
    }
}