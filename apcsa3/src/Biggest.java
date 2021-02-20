public class Biggest {
    public void determiner(int[][] ray) {
        int value = ray[0][0];
        for (int i=0; i < ray.length; i++) {
            for (int r=0; r < ray[i].length; r++) {
                if(value < ray[i][r]){
                    value = ray[i][r];
                }
            }
        }
        System.out.println("The biggest number is: " + value);
    }
}