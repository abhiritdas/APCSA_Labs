public class MatrixSummer1Runner {
    public static void main (String[] Args) {
        //int[][] arrays = new int[5][5];
        int [][] arrays = {{1, 2, 3, 4, 5 }, {6, 7, 8, 9, 0},  {6, 7, 1, 2, 5},  {6, 7, 8, 9, 0 }, {5, 4, 3, 2, 1}};
        MatrixSumming1 add = new MatrixSumming1();

        System.out.println(add.MatrixSummingMain(arrays));
    }
}