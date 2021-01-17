public class Parameters {
    private String name;
    private static int count = 0; //counts the number of instances

    public Parameters() {
        name = "";
        count++;
    }
    public Parameters(String name) {
        this.name = name;
        count++;
    }
    //accessor method for count:
    public static int getCount() {
        return count;
    }
    public String toString() {
        return "Name: " + this.name + "\nCount: " + this.count;
        }
}