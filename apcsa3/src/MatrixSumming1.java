public class MatrixSumming1 {
    public int MatrixSummingMain(int[][] ray) {
        int total = 0;

        for (int i = 0; i < ray.length; i++) {

            for (int r = 0; r < ray[i].length; r++) {

                total += ray[i][r];

            }
        }
        return total;
    }
}