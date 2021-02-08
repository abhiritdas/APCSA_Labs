public class MatrixCount1Runner {
    public static void main (String[] args) {
        int [][] word = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 0},{6, 7, 1, 2, 5},{6, 7, 8, 9, 0},{5, 4, 3, 2, 1}};

        MatrixCount1 add = new MatrixCount1();

        int count1 = 7;
        System.out.println("7: " + add.MatrixCountMain(count1));
        int count2 = 8;
        System.out.println("8: " + add.MatrixCountMain(count2));
        int count3 = 6;
        System.out.println("6: " + add.MatrixCountMain(count3));
        int count4 = 21;
        System.out.println("21: " + add.MatrixCountMain(count4));


    }
}