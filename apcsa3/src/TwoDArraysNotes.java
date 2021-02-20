import java.util.Arrays;

public class TwoDArraysNotes {
    public static void main (String[] Args) {

        //2D arrays of default values:
        //datatype[][] identifier = new datatype[# of arrays][# of elements in each array];
        int[][] numbers = new int[3][6];
        //an array 3 int arrays, each containing 6 elements, defaulted to 0 (total slots 18)
        String[][] words = new String[5][2];
        //an array of 5 String arrays, each containing 2 elements, defaulted to null (total slots 10)
        double[][] dubs = new double[4][4];
        //an array of 4 double arrays, each containing 4 elements, defaulted to 0.0 (total slots 16)

        //create arrays with initial values:
        int[] nums = {1, 5, 9, 12};
        int[][] nums2D = {{1, 2, 3}, {3, 7, 16}, {12, 5}, {9, 3, 6, 0}};

        //access each element:
        //two types of elements - int and int[]
        //access 9 in nums:
        System.out.println("elements in 1D array: " + nums[2]); //9
        System.out.println("element in 2D array: " + nums2D[3][0]); //9
        System.out.println();

        //*******************************************************************

        int[][] empty = new int [3][5];
        //assigning values to 2D array
        System.out.println("initial value: " + empty[0][0]);
        empty[0][0] = 7;
        System.out.println("updated value: " + empty[0][0]);

        //print 2D Arrays:
        System.out.println(Arrays.toString(empty)); //memory address for int[] in empty
    }
}