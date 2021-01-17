public class LoopNotesRunner {
    public static void main(String[] Args) {

        //for  initial     condition  inc/dec
        //     start       stop       step
        for (int val = -2; val != 4; val +=2) {
            System.out.println("The current value is: " + val); //body
        } //apply inc/dec, check condition, return to body if condition is true.
        System.out.println("");

        int val2 = 10;
        int loopCount = 0;
        for (; val2 >= 0; ) {
            int val3 = 5;
            System.out.println("Value is: " + val2);
            val2--;
            loopCount++;
        }
        System.out.println("This for loop ran " + loopCount + " times");
    }
}