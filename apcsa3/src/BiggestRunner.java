public class BiggestRunner {
    public static void main (String [] args) {
        int [][] a1 = {{1,2,3},{5,5,5,5}};
        int [][] a2 = {{1,2,3},{-5},{11},{21,2}};
        int [][] a3 = {{1,2},{-5,5},{5,5},{4,5,6,7},{123124,12312}};
        int [][] a4 = {{-20, -40},{-234,-234234 } };

        Biggest big = new Biggest();
        big.determiner(a1);
        big.determiner(a2);
        big.determiner(a3);
        big.determiner(a4);
    }
}