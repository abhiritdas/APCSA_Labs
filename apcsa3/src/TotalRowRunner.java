public class TotalRowRunner {
    public static void main (String[] Args) {
        int[][] a1 = {{1,2,3},{5,5,5,5}};
        int[][] a2 = {{1,2,3},{5},{1},{2,2}};
        int[][] a3 = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};

        TotalRow thing = new TotalRow();
        System.out.println(thing.determiner(a1));
        System.out.println(thing.determiner(a1));
        System.out.println(thing.determiner(a1));
        System.out.println(thing.determiner(a1));
    }
}