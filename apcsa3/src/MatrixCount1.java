public class MatrixCount1 {
    private static int [][] ray = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 0},{6, 7, 1, 2, 5},{6, 7, 8, 9, 0},{5, 4, 3, 2, 1}};
    private int adder;
    public int MatrixCountMain(int count) {
        adder = 0;
        for (int i = 0; i < ray.length; i++) {

            for (int r = 0; r < ray[i].length; r++) {

                if (ray[i][r] == count)
                    adder++;
            }
        }
        return adder;
    }
}